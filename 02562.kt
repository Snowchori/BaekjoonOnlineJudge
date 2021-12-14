/*
2562번

문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고
그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // 인덱스와 최댓값 변수 설정
    var ind: Int = 0
    var max_value = 0

    // 9번 반복하여 최댓값과 인덱스값 저장
    for (i in 0 until 9){
        // 자연수 입력받음
        val num: Int = readLine().toInt()

        if (max_value < num) {
            ind = i + 1
            max_value = num
        }
    }

    // 최댓값과 인덱스값 출력
    bw.write("${max_value}\n${ind}")

    bw.flush()
    bw.close()
}