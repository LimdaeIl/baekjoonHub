class Solution {
    public String solution(String phone_number) {    
        String answer = "";

    if (phone_number.length() == 4) {
      answer = phone_number;
    } else {
      for (int i = 0; i < phone_number.length() - 4; i++) {
        answer += "*";
      }

      for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
        answer += phone_number.charAt(i);
      }
    }
    return answer;
    }
}