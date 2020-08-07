import java.util.*

fun main(){
    print("Nilai : ")
    val reader = Scanner(System.`in`)
    val nilai:Int = reader.nextInt()
    if (nilai >= 75){
        println("Nilai kamu $nilai, selamat ya!")
    }else if (nilai <= 75) {
        println("Nilai kamu $nilai, silahkan ikut remidial")
    }
}