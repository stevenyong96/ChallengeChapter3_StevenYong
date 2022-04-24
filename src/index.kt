import Class.Choice
import Object.PlayerSuit
import Class.Utilities
import Function.FuncSuit.whosWinner
import Function.FuncSuit.isValidInput

private fun printString(any: Any){
    val value: String? = any as? String
    println(value)
}


fun main() {

    try{
        var isPlaying : Boolean = true

        //Cetak Menu Ke Layar dengan Singleton Object
        println(Utilities.menu)

        //Inisialisasi Object Player
        val playerOne = PlayerSuit(name="Pemain 1")
        val playerTwo = PlayerSuit(name="Pemain 2")

        while(isPlaying){
            //Input Masukan User
            print("1. Masukkan ${playerOne.name}: ")
            var pilihanPemain1 = readLine().toString()
            print("2. Masukkan ${playerTwo.name}: ")
            var pilihanPemain2 = readLine().toString()


            //Cek Valid Input
            val hasil1 = isValidInput(pilihanPemain1.uppercase().replace(" ","").trim())
            val hasil2 = isValidInput(pilihanPemain2.uppercase().replace(" ","").trim())

            //Cek Hasil
            if(hasil1 === true && hasil2 === true){
                println("Hasil")
                var result = whosWinner(pilihanPemain1.uppercase().replace(" ","").trim(), pilihanPemain2.uppercase().replace(" ",""))
                isPlaying = result
            }
            else{
                if(hasil1 === false){
                    println(Utilities.menuChoice)
                    println("Masukkan Pilihan ${playerOne.name} Salah , $pilihanPemain1 Tidak Terdaftar Dalam System , Silahkan Coba Lagi")
                    println()
                }
                if(hasil2 === false){
                    println(Utilities.menuChoice)
                    println("Masukkan Pilihan ${playerTwo.name} Salah , $pilihanPemain2 Tidak Terdaftar Dalam System , Silahkan Coba Lagi")
                    println()
                }
            }
        }
    }
    catch (e: Error){
        println(e.stackTrace)
    }
}

