/*
11654번

문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // 글자를 입력받음
    val s: String = readLine().trim()

    // 아스키 코드 값 출력
    bw.write("${s[0].toInt()}")

    bw.flush()
    bw.close()
}