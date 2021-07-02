/*
2438번

문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // n 입력받음
    val n: Int = readLine().toInt()

    // 출력할 별
    var star: String = ""

    // n 번 반복하여 별을 하나씩 늘려 출력
    for (i in 0 until n) {
        star += "*"
        bw.write("${star}\n")
    }

    bw.flush()
    bw.close()
}