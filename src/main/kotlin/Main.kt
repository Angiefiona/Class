fun main() {
    var alber = Human("Eddy", 42, 40.5)
    alber.eat(2)
    alber.birthday()
    alber.speak("Hello ladies and gentlemen.")


    var person = User("Jayden", "Musau", "Musaujayden@gmail.com", "0768214929", 7867)
    person.info("musaujayden@gmail.com")
    person.info1("0768214929")
}







class Human(var name:String, var age:Int, var weight:Double ){
    fun eat(foodWeight: Int){
        var newWeight = weight + foodWeight
        print("I am eating $newWeight kgs of food ")
    }
    fun speak(speech: String){
        var speak=speech
        println(speak)
    }
    fun birthday(){
       var  newAge=++age
        println(newAge)
    }
}
class User(var firstName: String, var lastName: String, var email:String, var phoneNumber:String, var passWord:Int){
    fun info(email: String){
        println("email")


    }
    fun info1(phoneNumber: String){
        println("phoneNumber")

        }
}