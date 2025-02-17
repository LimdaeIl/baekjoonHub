class Solution {
    public int solution(String s) {
        int answer = 0;
            answer = s.contains("-") 
                ? -1 * Integer.parseInt(s.substring(s.indexOf("-") + 1))
                : Integer.parseInt(s);

        return answer;
    }
}