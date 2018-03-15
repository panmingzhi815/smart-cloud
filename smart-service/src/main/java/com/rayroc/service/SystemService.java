package com.rayroc.service;

import com.rayroc.mapper.UserMapper;
import com.rayroc.model.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SystemService {

    @Autowired
    private UserMapper userMapper;

    public List<SystemUser> selectUser(SystemUser systemUser){
        return userMapper.selectUser(systemUser);
    }

    public SystemUser inserUser(SystemUser systemUser) {
        String userId = userMapper.insertUser(systemUser);
        systemUser.setId(userId);
        return systemUser;
    }

    public void updateUser(Map<String, Object> map) {
        userMapper.updateUser(map);
    }

    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }
}
