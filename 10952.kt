/*
10952번

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    while (true){
        // 한줄 입력받음
        val st = StringTokenizer(readLine())

        // a, b 분리
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        // a, b 둘다 0 이면 반복문 탈출
        if (a == 0 && b == 0) break

        // a + b 출력
        bw.write("${a + b}\n")
    }

    bw.flush()
    bw.close()
}