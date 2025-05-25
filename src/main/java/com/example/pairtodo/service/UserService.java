package com.example.pairtodo.service;

import com.example.pairtodo.model.User;
import com.example.pairtodo.mapper.UserMapper;
import com.example.pairtodo.model.UserExample;
import com.example.pairtodo.payload.RegisterRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import javax.annotation.Resource;

public class UserService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private UserMapper userMapper;

    @Resource
    private IdGeneratorService idGeneratorService;

    /**
     * 
     * @param registerRequest 
     * @return 
     */

    public User createUser(RegisterRequest registerRequest) {
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
    }
}
