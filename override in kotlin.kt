/*
Whenever we want to change functionality of parent's property or function , we call it overriding

*/

open class Mobile(val type : String){
  opern val name : String = ""
  open val size : Int = 5
  fun makeCall() = println("Calling from mobile")
  fun powerOf() = println("Powering off")
  open fun display() = println("Simple mobile display")
}

class OnePlus(typeParam : String) : Mobile(typeParam){
  super.display() // If we want to call first function of parent then we will use super keyword , we can call parent function from child
  override fun display() = println("One plus display") // We must follow same signature as parent function
}
