package pers.dao;

import pers.pojo.User;

public interface TestDao {
    User selectByPrimaryKey(Integer id);
}