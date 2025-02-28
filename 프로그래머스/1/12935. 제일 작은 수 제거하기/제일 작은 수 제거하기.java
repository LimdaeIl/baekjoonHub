class Solution {
    public int[] solution(int[] arr) {
    if (arr.length < 2) return new int[]{-1};

    int[] answer = new int[arr.length - 1];
    int min = arr[0];

    for (int i = 1; i <arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    int index = 0;
    for (int i : arr) {
      if (i != min) {
        answer[index++] = i;
      }
    }

    return answer;
    }
}