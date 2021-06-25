import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    // a, b 입력받음
    val (a : Int, b : Int) = readLine()
        .split(" ")
        .map{it.toInt()}

    // a + b 출력
    println(a + b)
}