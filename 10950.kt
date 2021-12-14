/*
10950번

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    // 테스트 개수 t 입력받음
    val t: Int = readLine().toInt()

    // t 만큼 반복
    for (i in 0 until t){
        // a, b 입력받음
        val (a: Int, b:Int) = readLine()
            .split(" ")
            .map { it.toInt() }

        // a + b 출력
        println(a + b)
    }
}