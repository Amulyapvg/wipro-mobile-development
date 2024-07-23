data class Data(val name: String, val age: Int)
 
fun sendData() : Data {
    return Data("Amulya", 50)
}
 
fun main() {
    val obj = sendData()
    println("Name is ${obj.name}")
    println("Age is ${obj.age}")
    // Destructing objects
    val (name, age) = sendData()
    println("$name " + "$age")  
}