class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0; // 단어 내 인덱스
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer.append(c);
                idx = 0;  // 공백을 만나면 단어가 끝난 것으로 보고 인덱스 리셋
            } else {
                if (idx % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }
        return answer.toString();
    }
}