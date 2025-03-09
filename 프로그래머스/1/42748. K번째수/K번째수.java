import java.util.*;

class Solution {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int startIndex = commands[i][0];
      int endIndex = commands[i][1];
      int selectIndex = commands[i][2];

      int[] copy = Arrays.copyOfRange(array, startIndex - 1, endIndex);
      Arrays.sort(copy);
      answer[i] = copy[selectIndex - 1];
    }
    return answer;
  }
}