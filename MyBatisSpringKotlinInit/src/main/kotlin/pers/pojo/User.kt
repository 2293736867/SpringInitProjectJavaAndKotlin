package pers.pojo

import java.io.Serializable

class User:Serializable {

    var id = 0
    var name = ""
    private val serialVersionUID = 1L

    constructor()
    {
        id = 0
    }
    constructor(name: String):this()
    {
        this.name = name
    }
    override fun toString() = "id:$id\tname:$name"
}