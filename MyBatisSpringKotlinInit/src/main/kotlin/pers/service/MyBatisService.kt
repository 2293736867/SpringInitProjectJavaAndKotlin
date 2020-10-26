package pers.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import pers.dao.UserDao
import pers.pojo.User


@Service
@Transactional
open class MyBatisService(@Autowired private var dao:UserDao)
{
    open fun test()
    {
        println(dao.selectByPrimaryKey(1))
    }
}