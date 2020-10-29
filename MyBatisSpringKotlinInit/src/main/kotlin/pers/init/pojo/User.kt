package pers.init.pojo

import java.io.Serializable

class User:Serializable {

    var id = 0
    var name = ""
    var age = 0

    override fun toString() = "id:$id\tname:$name\tage:$age"
}