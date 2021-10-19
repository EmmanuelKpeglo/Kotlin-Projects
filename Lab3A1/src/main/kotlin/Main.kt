import java.sql.Time
import java.time.LocalTime
import kotlin.random.Random as RNG
import java.util.Random as RAJ

fun main(args: Array<String>) {

    val kotlinNumber : RNG = RNG(LocalTime.now().nano)

    val javaNumber : RAJ = RAJ(LocalTime.now().nano.toLong())

    println("Kotlin random number is ${kotlinNumber.nextLong()}")

    println("Java random number is ${javaNumber.nextLong()}")

}