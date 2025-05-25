package com.example.pairtodo.service;

import com.example.pairtodo.model.User;
import com.example.pairtodo.mapper.UserMapper;
import com.example.pairtodo.model.UserExample;
import com.example.pairtodo.payload.RegisterRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import javax.annotation.Resource;
import java.util.List;

public class UserService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private UserMapper userMapper;

    @Resource
    private IdGeneratorService idGeneratorService;

    @Resource
    private DistributedLockManager lockManager;

    @Resource
    private LockKeyManager lockKeyManager;

    /**
     * 
     * @param registerRequest 
     * @return 
     */

    public User createUser(RegisterRequest registerRequest) {
        String lockKey = lockKeyManager.getUserRegisterLockKey(registerRequest.getPhone());
        try {
            return lockManager.executeWithLock(lockKey, () -> {
                UserExample example = new UserExample();
                example.createCriteria().andPhoneEqualTo(registerRequest.getPhone());
                if (userMapper.countByExample(example) > 0) {
                    throw new RuntimeException("手机号已被注册");
                }

                String encodedPassword = passwordEncoder.encode(registerRequest.getPassword());
                
                User user = new User();
                user.setAccountId(idGeneratorService.generateNextId());
                user.setUsername(registerRequest.getUsername());
                user.setPhone(registerRequest.getPhone());
                user.setPassword(encodedPassword);

                userMapper.insertSelective(user);
                return user;
            });
        } catch (Exception e) {
            throw new RuntimeException("注册失败", e);
        }
    }
    
    public User authenticate(String phone, String rawPassword) {
        UserExample example = new UserExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(example);
        
        if (users.isEmpty()) {
            throw new RuntimeException("用户不存在");
        }
        
        User user = users.get(0);
        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new RuntimeException("密码错误");
        }
        
        return user;
    }
}
