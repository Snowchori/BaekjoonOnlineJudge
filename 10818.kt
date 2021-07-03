/*
10818번

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // n 입력받음
    val n: Int = readLine().toInt()

    // 한줄 입력받아 배열 생성
    val st = StringTokenizer(readLine())
    val arr_list = Array(n) { st.nextToken().toInt() }

    // 최솟값 최댓값 출력
    bw.write("${arr_list.minOrNull()} ${arr_list.maxOrNull()}")

    bw.flush()
    bw.close()
}