/*
8958번

문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다.
문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // 테스트 케이스 개수 입력받음
    val t: Int = readLine().toInt()

    // 테스트 케이스만큼 반복
    for (i in 0 until t){
        // 한줄 입력받음
        val st = readLine().trim()

        // 카운트 값, 결과값 설정
        var cnt: Int = 0
        var result: Int = 0

        // O이면 cnt에 1을 더하고 X면 cnt를 0으로 초기화
        for (s in st){
            if (s == 'O') cnt++
            else cnt = 0

            // 결과값에 cnt를 더함
            result += cnt
        }

        // 결과값 출력
        bw.write("${result}\n")
    }

    bw.flush()
    bw.close()
}