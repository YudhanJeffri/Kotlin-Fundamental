fun setUser(name:String, hobby:String, age:Int) = ("My name is $name, I like $hobby, and I'm $age years old")
fun main(){
    val user = setUser(name = "Yudhan Jeffri Djuniartha", hobby = "Learn Kotlin", age = 17)
    println(user)
}
