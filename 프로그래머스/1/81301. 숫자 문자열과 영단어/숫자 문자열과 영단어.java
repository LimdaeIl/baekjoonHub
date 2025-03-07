import java.util.*;

class Solution {
    public int solution(String s) {
        String[] numStrs = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < numStrs.length; i++) {
            s = s.replace(numStrs[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}