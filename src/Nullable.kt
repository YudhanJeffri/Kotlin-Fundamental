fun main() {
    val text: String? = null
    val textNull = text ?: "Smk Telkom"
    val textLength = textNull.length
    println("Jumlah kata dari string $textNull sebanyak $textLength")
}