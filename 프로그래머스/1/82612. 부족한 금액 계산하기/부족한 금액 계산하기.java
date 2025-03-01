class Solution {
    public long solution(int price, int money, int count) {
    long answer = -1;
    long temp = 0;

    for (int i = 1; i <= count; i++) {
      temp += (long) price * i;
    }

    answer = temp - money;

    if (answer >= 0) {
      return answer;
    } else {
      return 0;
    }
  }
}