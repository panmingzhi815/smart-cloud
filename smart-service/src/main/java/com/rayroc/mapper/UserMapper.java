package com.rayroc.mapper;

import com.rayroc.model.SystemUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<SystemUser> selectUser(SystemUser systemUser);

    String insertUser(SystemUser systemUser);

    void updateUser(Map<String, Object> map);

    void deleteUser(String userId);
}
