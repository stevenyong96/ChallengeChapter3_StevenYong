package Class

import Class.AbstractPlayer

open class Player() : AbstractPlayer() {
    //Overriding
    override var name: String = "pemain"
    override fun callMyName(): String {
        return name
    }

    //Overloading
    fun mood() {
        println("Biasa saja");
    }

    fun mood(inputVal : String) : String {
        return inputVal
    }
}