package pers.init.dao;

import pers.init.pojo.User;

public interface UserDao {
    User selectById(Integer id);
}