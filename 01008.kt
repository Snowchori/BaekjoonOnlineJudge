/*
1008번

문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가
10-9 이하이면 정답이다.
 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    // a, b 입력받음
    val (a: Double, b: Double) = readLine()
        .split(" ")
        .map{ it.toDouble() }

    // a / b 출력
    println((a / b))
}
