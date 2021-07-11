/*
11720번

문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // 숫자의 개수 n 입력받음
    val n: Int = readLine().toInt()

    // 한줄 입력받음
    val st = readLine()

    // 결과값
    var result: Int = 0

    // 숫자 하나하나 더함
    for (i in st){
        result += i - '0'
    }

    // 결과값 출력
    bw.write("${result}")

    bw.flush()
    bw.close()
}