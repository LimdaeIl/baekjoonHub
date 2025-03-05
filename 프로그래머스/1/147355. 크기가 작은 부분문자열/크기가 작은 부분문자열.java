class Solution {
  public static int solution(String t, String p) {
    int answer = 0;
    long pValue = Long.parseLong(p);

    for (int i = 0; i <= t.length() - p.length(); i++) {
      long subValue = Long.parseLong(t.substring(i, i + p.length()));
      if (subValue <= pValue) {
        answer++;
      }
    }
    return answer;
  }
}