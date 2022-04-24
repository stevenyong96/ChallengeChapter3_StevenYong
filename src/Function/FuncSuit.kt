package Function

import Class.Choice

object FuncSuit {
    public fun whosWinner(inputVal1 : String , inputVal2 : String) : Boolean{
        //BATU
        val batu = Choice.BATU.name
        val rock = Choice.ROCK.name
        val stone = Choice.STONE.name

        //GUNTING
        val gunting = Choice.GUNTING.name
        val scissors = Choice.SCISSORS.name

        //KERTAS
        val kertas = Choice.KERTAS.name
        val paper = Choice.PAPER.name

        val pemain1Batu = inputVal1 == batu || inputVal1 == rock || inputVal1 == stone
        val pemain1Gunting = inputVal1 == gunting || inputVal1 == scissors
        val pemain1Kertas = inputVal1 == kertas || inputVal1 == paper

        val pemain2Batu = inputVal2 == batu || inputVal2 == rock || inputVal2 == stone
        val pemain2Gunting = inputVal2 == gunting || inputVal2 == scissors
        val pemain2Kertas = inputVal2 == kertas || inputVal2 == paper

        if(pemain1Batu){
            if(pemain2Gunting){
                println("Pemain 1 MENANG!")
                return false
            }
            else if(pemain2Batu){
                println("DRAW!")
                return true
            }
            else if(pemain2Kertas){
                println("Pemain 2 MENANG!")
                return false
            }
        }
        else if (pemain1Gunting){
            if(pemain2Gunting){
                println("DRAW")
                return true
            }
            else if(pemain2Batu){
                println("Pemain 2 MENANG!")
                return false
            }
            else if(pemain2Kertas){
                println("Pemain 1 MENANG!")
                return false
            }
        }
        else if(pemain1Kertas){
            if(pemain2Gunting){
                println("Pemain 2 MENANG!")
                return false
            }
            else if(pemain2Batu){
                println("Pemain 1 MENANG!")
                return false
            }
            else if(pemain2Kertas) {
                println("DRAW!")
                return true
            }
        }

        return true
    }

    public fun isValidInput(inputVal : String) : Boolean {
        //ENUM CLASS Pilihan suit
        val allChoice : Array<Choice> = Choice.values()
        val listAllChoice = allChoice.toList().toString()

        var hasil = false
        hasil = listAllChoice.contains(inputVal.uppercase().replace(" ","").trim())
        return hasil
    }

}