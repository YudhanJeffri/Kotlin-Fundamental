fun main() {
    val panjang = "22"
    val lebar = 12.6
    val tinggi = 11
    val volume : Double
    //to do
    volume = hitungVolume(panjang.toDouble(),lebar, tinggi.toDouble()).toString().toDouble()
    println("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi ini adalah $volume")
}
fun hitungVolume(p:Double,l:Double,t:Double):Float {
    val v = p * l * t
    //to do
    return v.toFloat()
}