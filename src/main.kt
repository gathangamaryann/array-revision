fun main (){
    words("codehive")
    var t = numbers(9,4)
    println(t)
    var letter=make("judy",13)
    println(letter)
    var y = find("maryann")
    println(y)

}
fun  words(w:String){
    println((w[4]).toString()+w[5]+w[6]+w[7])
}
fun numbers(num1:Int,num2: Int):Int{
    var b = num1%num2
    return b

}fun make(name:String,age:Int):String{
    var cat =("Hi my name is $name and i am $age years old")
    return cat

}
fun find(w: String):Int{
    return w.length

}
