class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String k = String.valueOf(n);
        char[] c = k.toCharArray();
        answer = new int[c.length];
        int p = 0;


        for (int i = c.length - 1; i >= 0; i--) {
            answer[p++] = Character.getNumericValue(c[i]);
        }

        return answer;
    }
}