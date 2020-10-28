package pers.pojo

import java.io.Serializable

class User:Serializable {

    var id = 0
    var name = ""
    var age = 0
    private val serialVersionUID = 1L

    constructor()
    {
        id = 0
    }
    constructor(name: String,age:Int):this()
    {
        this.name = name
        this.age = age
    }
    override fun toString() = "id:$id\tname:$name\tage:$age"
}