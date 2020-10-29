package pers.init.dao

import pers.init.pojo.User

interface UserDao {
    fun selectById(id:Int):User
}
