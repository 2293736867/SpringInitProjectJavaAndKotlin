package pers.dao

import pers.pojo.User

interface UserDao {
    fun selectById(id:Int):User
}
