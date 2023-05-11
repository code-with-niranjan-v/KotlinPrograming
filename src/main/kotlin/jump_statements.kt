fun main() {
    //break example
    /*
        break statement makes the control to exit
        the loop.
     */
    for (i in 1..5){

        if(i == 4){
            break
        }

        println(i)

    }

    //continue example
    /*
        continue statement makes the control to skip
        the iteration that is running and starts next
        iteration in the loop.
     */
    for (i in 1..5){

        if(i == 4){
            continue
        }

        println(i)

    }

}