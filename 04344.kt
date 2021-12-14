/*
4344번

문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // 테스트 케이스 개수 c 입력받음
    val c: Int = readLine().toInt()

    // c번 반복
    for (i in 0 until c){
        // 한줄 입력받음
        val st = StringTokenizer(readLine())

        // 학생의 수 n 입력받음
        val n: Int = st.nextToken().toInt()

        // 학생들의 점수를 배열에 저장
        val score = Array(n) {st.nextToken().toDouble()}

        // 학생들의 점수 평균을 구함
        val avg: Double = score.sum() / n

        // 평균을 넘는 학생의 수를 구함
        var cnt: Int = 0
        for (s in score) if (avg < s) cnt++

        // 평균을 넘는 학생의 비율 출력
        val overAvg: String = String.format("%.3f",cnt.toDouble() * 100 / n)
        bw.write("${overAvg}%\n")
    }

    bw.flush()
    bw.close()
}