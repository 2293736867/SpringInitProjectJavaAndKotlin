package pers.dao;

import pers.pojo.User;

import java.util.Map;

public interface UserDao {
    User selectById(Integer id);
}