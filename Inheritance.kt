//We use inheritence to reduce code duplicacy 
// We need to explicitly define either we can make a class inheritable or not by open keyword as
open class phone{
  var name:String =""
  var type:String =""
  var volume:Int = 10

  fun makeCall() {}
  fun display() {}
}

class BasicPhone : phone(){
  fun getDeviceInfo() {}
}

class SmartPhone : phone(){
  fun playMovies() {}
  fun takePictures() {}
  fun getLocation() {}
}

// We reduced duplicacy here by using inheritance , we inherit basic features from class phone , esi kaunsi classes hain jinko hum common bna sakte hain , kaunse features , kaunse properties ko
/*
Inheritance example : inheritance is a IS-A relationshiop because 
Car is a vehicle , Truck is a vehicle , so we can make a parent class of vehicle , because it is a IS-A relationship
Square is a shape , Circle is a shape


Conclusion :
* Code Reusability by using inheritance
* open keyword
* Can not inherit from multiple class
* Parent class constructor is called before child class constructor
*/
