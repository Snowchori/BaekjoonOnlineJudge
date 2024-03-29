/*
10871번

문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
X보다 작은 수는 적어도 하나 존재한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // n, x 입력받음
    val (n: Int, x: Int) = readLine()
        .split(" ")
        .map { it.toInt() }

    // 한줄 입력받음
    val st = StringTokenizer(readLine())

    for (i in 0 until n) {
        // 수열의 수 하나를 꺼냄
        val a = st.nextToken().toInt()

        // 그 수가 x 보다 작다면 출력
        if (a < x) bw.write("$a ")
    }

    bw.flush()
    bw.close()
}