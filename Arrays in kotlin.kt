// We define arrays in kotlin as
var arr = ArrayOf("One","Two","Three")

// We can also explicitly define array as
var arr = ArrayOf<Int>(1,2,3);

// We can also use for loop to define what print as
for((i:Int , e : String) in arr.withIndex()){
    println("$i - $e");
}

// we can accesss and set in array as

arr.set(0,"Hello")
arr.get(0)
arr[0]
arr[0] = "Hello"
