import java.util.*;

class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환
        String str = Long.toString(n);
        
        // 문자열을 문자 배열로 변환 후 정렬
        Character[] charArray = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        
        // 내림차순 정렬
        Arrays.sort(charArray, Comparator.reverseOrder());
        
        // 정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder sortedStr = new StringBuilder();
        for (char c : charArray) {
            sortedStr.append(c);
        }
        
        // 문자열을 long으로 변환하여 반환
        return Long.parseLong(sortedStr.toString());
    }
}
