class Solution {
    public long solution(long n) {
    long sqrt = (long) Math.sqrt(n); // 제곱근을 구하고 정수로 변환
    if (sqrt * sqrt == n) { // 제곱수가 맞는지 확인
      return (sqrt + 1) * (sqrt + 1); // (x+1)^2 반환
    }
    return -1;
    }
}