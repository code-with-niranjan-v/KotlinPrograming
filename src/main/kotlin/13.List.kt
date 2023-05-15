fun main(){
	
	//List is a Ordered Collections of objects.
	var numbers = listOf(1,23,4,5)
	
	//Iterating
	//Method 1
	numbers.forEach{
		println(it)
}
	//Method 2
	for(i in numbers){
		println(i)
	}

	//Indexing
	println(numbers[3])


	//Contains and ContainsAll
	println(numbers.contains(1))
	println(numbers.containsAll(listOf(23,7)))

	//List are immutable by Default.
	//So, we cannot modify them.

	

}
