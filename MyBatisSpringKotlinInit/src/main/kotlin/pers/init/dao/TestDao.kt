package pers.init.dao

import pers.init.pojo.User

interface TestDao {
    fun selectByPrimaryKey(id:Int): User
}