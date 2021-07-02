/*
2439번

문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // n 입력받음
    val n: Int = readLine().toInt()

    // 출력할 문자열
    val sb = StringBuilder()

    // 공백을 n 만큼 더함
    for (i in 0 until n) sb.append(" ")

    // 맨앞 공백 하나를 지우고 맨뒤 별하나를 추가하여 출력
    for (i in 0 until n){
        sb.delete(0,1)
        sb.append("*")
        bw.write("${sb}\n")
    }

    bw.flush()
    bw.close()
}