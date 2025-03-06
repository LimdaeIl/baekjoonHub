class Solution {
    public String solution(String s, int n) {
    StringBuilder answer = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        // 'A'의 ASCII 코드는 65
        char shifted = (char) ((c - 'A' + n) % 26 + 'A');
        answer.append(shifted);
      } else if (Character.isLowerCase(c)) {
        // 'a'의 ASCII 코드는 97
        char shifted = (char) ((c - 'a' + n) % 26 + 'a');
        answer.append(shifted);
      } else {
        // 공백 등 알파벳이 아닌 경우 그대로 추가
        answer.append(c);
      }
    }

    return answer.toString();
    }
}