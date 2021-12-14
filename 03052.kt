/*
3052번

문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다.
이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    // 나머지를 저장할 집합 생성
    val intHashSet: HashSet<Int> = hashSetOf()

    // 10개의 숫자를 입력받은후 42로 나눈 나머지를 집합에 저장
    for (i in 0 until 10) intHashSet.add(readLine().toInt()%42)

    // 집합의 원소개수 출력
    bw.write("${intHashSet.size}")

    bw.flush()
    bw.close()
}