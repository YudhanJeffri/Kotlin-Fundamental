fun main(){
    val wordOne = "Modern"
    val wordTwo = "Concise"
    val wordThree = "Pragmatic"
    val wordFour = "Safe"
    val a = "Kotlin is "
    val line = """
        $a$wordOne
        $a$wordTwo
        $a$wordThree
        $a$wordFour
    """.trimIndent()
    println(line)
}