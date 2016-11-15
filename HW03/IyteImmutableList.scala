//Elnura Arslan
//180201039


class IyteImmutableList(val head: Int, val tail: MyImmutableList) extends MyImmutableList {
  override def toString: String = head + " " + tail
}
abstract class MyImmutableList {
  def head: Int
  def tail: MyImmutableList
  def add(item: Int): MyImmutableList = new IyteImmutableList(item, this)
}
object MyImmutableListNil extends MyImmutableList {
  def head: Nothing = throw new Exception("empty list -> head")
  def tail: MyImmutableList = throw new Exception("empty list -> tail")
  override def toString =  ""
}
object IyteImmutableList {
  def apply(items: Int*): MyImmutableList = {
    var list: MyImmutableList = MyImmutableListNil.asInstanceOf[MyImmutableList]
    for (element <- 0 until items.length reverse) //reverse to add on list serially
      //list.add(items(element))
      list = list.add(items(element) )
    list
  }
}
