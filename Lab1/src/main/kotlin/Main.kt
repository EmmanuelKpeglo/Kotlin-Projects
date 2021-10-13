fun main(args: Array<String>) {

//    //Q1
//    println("Hello World!")

//    //Q2
//    var myVar:String = "Hello!"
//
//    println("$myVar World Again\n\n")

//    //Q3
//    fun calculateY(m : Int, x : Int, c : Int) : Int {
//        // y = mx + c - formula for a straight line
//        return m * x + c
//    }
//
//    var y:Int
//    var pointsCounter:Int = 1
//    println("The points (X, Y) on the line are:")
//
//    for (x in -5..5){
//        y = calculateY(3, x, -1)
//        println("$pointsCounter. \t ($x, $y)")
//        pointsCounter++
//    }

//    //Q4
//    var pointsCounter:Int = 1
//        println("The points (X, Y) on the line are:")
//        for (x in 0 until 20) {
//            println("$pointsCounter. \t ($x, ${(3 * x) + 5}) \t ($x, ${(4 * x) + 2})")
//            pointsCounter++
//    }


//    //Q5
    var yOne:Int
    var yTwo:Int
    fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
        for (x in 0..100) {
            yOne = (mOne * x) + cOne
            yTwo = (mTwo * x) + cTwo
            if (x == 100 && yOne != yTwo){
                println("Don't intersect")
                break
            }

            if (yOne == yTwo) {
                println("$x is the X coordinate at which the two lines intersect")
                break
            }
        }
    }

    intersection(3, 5, 4, 2)
    intersection(2, 1, 3, 3)
    intersection(-2, 3, 3, -2)


    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

}