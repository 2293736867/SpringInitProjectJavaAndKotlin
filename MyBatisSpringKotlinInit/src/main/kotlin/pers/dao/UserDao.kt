package pers.dao

import pers.pojo.User

interface UserDao {
    fun deleteByPrimaryKey(id:Int):Int
    fun insert(record:User):Int
    fun insertSelective(record: User):Int
    fun selectByPrimaryKey(id: Int):User
    fun updateByPrimaryKey(record: User):Int
    fun updateByPrimaryKeySelective(record: User):Int
}
