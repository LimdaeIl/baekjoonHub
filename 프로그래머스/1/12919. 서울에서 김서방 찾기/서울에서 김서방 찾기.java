class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(String s: seoul) {
            if(s.equals("Kim")) {
                answer = String.valueOf(x);
                break;
            }
            x++;
        }
        
        return "김서방은 " + x + "에 있다";
    }
}