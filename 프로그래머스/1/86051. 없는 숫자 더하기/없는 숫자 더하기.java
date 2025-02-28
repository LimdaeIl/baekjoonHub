class Solution {
    public int solution(int[] numbers) {
    int answer = 0;
    int[] temp = new int[10];

    for (int number : numbers) {
      temp[number]++;
    }

    for (int i = 0; i < temp.length; i++) {
      if (temp[i] != 1) {
        answer += i;
      }
    }

    return answer;
    }
}