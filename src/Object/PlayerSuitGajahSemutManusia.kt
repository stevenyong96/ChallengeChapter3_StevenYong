package Object

import Class.Player

class PlayerSuitGajahSemutManusia(name: String = "" , mood : String = "") : Player(){
    override var name : String  = name
        get() = field
        set(value) {
            if(value.isNotBlank()){
                field = value
            }
        }

    override fun callMyName(): String {
        return super.callMyName()
    }

    fun mood(){
        println("Senang")
    }
}