package com.example.pairtodo.service;

import org.springframework.stereotype.Service;

@Service
public class LockKeyManager {
    private static final String LOCK_PREFIX = "lock:";

    public String getIdGeneratorLockKey() {
        return LOCK_PREFIX + "id_generator";
    }

}
