fun main(){
	
	//List is a Ordered Collections of objects.
	var numbers = listOf(1,23,4,5)
	
	//Iterating
	numbers.forEach{
		println(it)
}


	//Contains and ContainsAll
	println(numbers.contains(1))
	println(numbers.containsAll(listOf(23,7)))

	//List are immutable by Default.
	//So, we cannot modify them.

	

}
