/*
11021번

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
테스트 케이스 번호는 1부터 시작한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    // 테스트 개수 t 입력받음
    val t: Int = readLine().toInt()

    // t 만큼 반복
    for (i in 0 until t){
        // 한줄 입력받음
        val st = StringTokenizer(readLine())

        // a, b 분리
        val a: Int = st.nextToken().toInt()
        val b: Int = st.nextToken().toInt()

        // a + b 출력
        bw.write("Case #${i+1}: ${a + b}\n")
    }

    bw.flush()
    bw.close()
}