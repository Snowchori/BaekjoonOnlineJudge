/*
1065번

문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // n 입력받음
    val n: Int = readLine().toInt()

    // cnt 변수 설정
    var cnt = 0

    // 1부터 n까지 한수인지 아닌지 판별하여 한수이면 cnt++을 해줌
    for (i in 1 until n + 1) if (isHan(i)) cnt++

    // cnt 출력
    bw.write("$cnt")

    bw.flush()
    bw.close()
}

// 한수인지 아닌지 판별하는 함수
fun isHan(n: Int) : Boolean {
    // n을 변경가능한 값으로 변경
    var num = n

    // n의 자리수를 구함
    val len = n.toString().length

    // 2자리수 이하라면 true 반환
    if (len <= 2) return true

    // 1의 자리수를 구하고 num을 10으로 나눔
    var pre = num % 10
    num /= 10

    // 10의 자리수에서 1의 자리수를 뺌
    var term = num % 10 - pre

    // pre에 num % 10을 넣고 num을 10으로 나눔
    pre = num % 10
    num /= 10

    // 반복하여 term과 연속된 수의 차이가 다르면 false를 반환
    for (i in 2 until len){
        if (num % 10 - pre != term) return false
        pre = num % 10
        num /= 10
    }

    return true
}