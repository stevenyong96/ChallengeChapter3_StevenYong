package Object

import Class.Player

class PlayerSuit(name: String = "" , mood : String = "") : Player() {
    override var name : String  = name
        get() = field
        set(value) {
            if(value.isNotBlank()){
                field = value
            }
        }

}