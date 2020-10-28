package pers.dao

import pers.pojo.User

interface TestDao {
    fun selectByPrimaryKey(id:Int): User
}