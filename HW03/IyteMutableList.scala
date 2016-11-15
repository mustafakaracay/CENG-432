class IyteMutableList {
	class Node (var data:Int, var next:Node)
	var head:Node = null
	var last:Node = null
	
	def add(x:Int): Unit = {
		if (head==null) {
			head = new Node(x,null)
			last=head
		}else{
			last.next = new Node(x,null)
			last=last.next
		}
	}
	
	override def toString: String = {
		var temp = head
		var result:String = ""
		
		while(temp != last){
			result = result + temp.data + ", "
			temp=temp.next
		}
		result=result+last.data
		result
	}
}

object IyteMutableList{
	def apply():IyteMutableList = new IyteMutableList()
}