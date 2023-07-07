// If we define val or var in construction of function then its property would be created else it will behave as parameter as
public Automobile(val name:String ,val seats:Int , isAirBags:Boolean){
}
//here we have created val name and seats so these are properties means we can directly access these properties wherever we need to define isAirBag because it is parameter

// init{ } Block is also executed when object are created , we can make multiple inti{} Block in single class



// We can also create secondary constructor in kotlin , rule is you have to call primary constructor from secondary constructor 

public Automobile(val name : String , val seats:Int , val engine : String){
    constructor(nameParam : String , engineParam : String) : this(nameParam,5,engineParam)
}
// benefit of secondary constructor is we can reduce parameters in constructor by calling secondary constructor
