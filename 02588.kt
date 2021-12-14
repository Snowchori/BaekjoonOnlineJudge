/*
2588번

문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때
(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가,
둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    // 첫째 줄 입력받음
    val first: Int = readLine().toInt()
    // 둘째 줄 입력받음
    val second: String = readLine().trim()

    // 각 자리수마다 곱을 출력
    for (i in 2 downTo 0){
        println(first * (second[i] - '0'))
    }
    // 전체 곱을 출력
    println(first * second.toInt())
}