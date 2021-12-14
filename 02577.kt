/*
2577번

문제
세 개의 자연수 A, B, C가 주어질 때
A × B × C를 계산한 결과에 0부터 9까지
각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면
A × B × C = 150 × 266 × 427 = 17037300 이 되고,
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

입력
첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다.
A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

출력
첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에
1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // a, b, c 입력받음
    val a: Int = readLine().toInt()
    val b: Int = readLine().toInt()
    val c: Int = readLine().toInt()

    // a * b * c 의 값을 string으로 저장
    val s: String = (a * b * c).toString()

    // 각 숫자가 몇 번 쓰였는지 저장하는 배열
    val arr = Array(10) {0}

    // 각 자리수의 숫자인덱스 1더하기
    for (i in s) arr[i-'0']++

    // 각 숫자가 몇 번 쓰였는지 출력
    for (i in arr) bw.write("$i\n")

    bw.flush()
    bw.close()
}