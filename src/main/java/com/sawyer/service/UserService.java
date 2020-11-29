package com.sawyer.service;

import com.sawyer.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserService {
    void register(User user);

    User login(String username, String password);

    User findOne(String username);

}
