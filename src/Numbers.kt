fun main() {
    var panjang = "22"
    var lebar = 12.6
    var tinggi = 11
    var volume : Double
    //to do
    val pa: Float = panjang.toFloat()
    val ti: Float = tinggi.toFloat()
    volume = hitungVolume(pa.toDouble(),lebar, ti.toDouble()).toString().toDouble()
    println("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi ini adalah $volume")
}
fun hitungVolume(p:Double,l:Double,t:Double):Float {
    var v = p * l * t
    //to do
    return v.toFloat()
}