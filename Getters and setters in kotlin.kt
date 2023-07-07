// We can't make lateint var of type boolean , float , Integer , lateint keyword initialize variable later 

// We can use setters to define if we are setting valid value to properties or not in class for eg , age can't be negative , so it's type of check as
class Person(nameParam : String , ageParam:Int){
    var name:String = nameParam
    var age:Int = ageParam
    set(value){
      if(value>0){
        field = value // Field is property by which we set value to properties/members of class
      }
      else print("Field can't be negative") // If age is negative 
    }

    get(){
      return field.toUpperCase() // Whenever we access property/member of class we will get String in UPPERCASE 
    }

    // If we don't define getters and setters explictly kotlin defines automatically like this
    set(value) field = value
    get() field
}
