import java.util.*;

class Solution {
  public int[] solution(String s) {
    int length = s.length();
    int[] answer = new int[length];
    Map<Character, Integer> recent = new HashMap<>();

    for (int i = 0; i < length; i++) {
      char current = s.charAt(i);
      if (!recent.containsKey(current)) {
        answer[i] = -1;
      } else {
        answer[i] = i - recent.get(current);
      }
      recent.put(current, i);
    }
    return answer;
  }
}