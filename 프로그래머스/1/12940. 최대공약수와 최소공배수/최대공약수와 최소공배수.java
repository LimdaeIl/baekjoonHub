class Solution {
    public int[] solution(int n, int m) {
    int[] answer = new int[2];
    int max = Math.max(n, m);
    int min = Math.min(n, m);

    while (max != 0) {
      int temp = max;
      max = min % max;
      min = temp;
    }

    answer[0] = min;
    answer[1] = n * m / min;

    return answer;
    }
}