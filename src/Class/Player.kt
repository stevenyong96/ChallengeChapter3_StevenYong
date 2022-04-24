package Class

import Class.AbstractPlayer

open class Player() : AbstractPlayer()  {
    override var name: String = "pemain"
    override fun callMyName(): String {
        return name
    }
}