abstract class IyteImmutableList {
	def head:Int
	def tail:IyteImmutableList
	def add(x:Int):IyteImmutableList
}

class TempIyteImmutableList (override val head:Int,override val tail:IyteImmutableList) extends IyteImmutableList{
	override def add(x:Int): IyteImmutableList = {
		new TempIyteImmutableList(x,this)
	}

  override def toString:String={
		
		var result:String =""
		result= head + ", " + tail
		result
	}
}

object Nil extends IyteImmutableList {
	override def head: Int = throw new Exception("Empty List")
	override def tail: IyteImmutableList = throw new Exception("Empty List")
	override def add(x: Int): IyteImmutableList =new  TempIyteImmutableList(x,Nil)
	override def toString =  ""
}

object  IyteImmutableList{
	def apply(): IyteImmutableList = Nil
}
