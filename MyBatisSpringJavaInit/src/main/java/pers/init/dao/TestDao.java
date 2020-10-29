package pers.init.dao;

import pers.init.pojo.User;

public interface TestDao {
    User selectByPrimaryKey(Integer id);
}