object Simple extends App {
	val array = Array(10,25,30)
	array.foreach ((arg:Int) => if(arg%2==0) println(arg*2) else println(arg*3))
}