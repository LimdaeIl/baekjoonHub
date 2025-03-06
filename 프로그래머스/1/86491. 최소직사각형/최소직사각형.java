class Solution {
    public int solution(int[][] sizes) {
    int answer = 0;
    int index = 0;
    int max = 0;
    int a = 0;
    int b = 0;

    // 1. 가로 혹은 세로 중 가장 큰 숫자를 기준으로 숫자 위치를 수정하기
    for (int[] size : sizes) {
      for (int i = 0; i < size.length; i++) {
        if (size[i] > max) {
          max = size[i];
          index = i;
        }
      }
    }

    // 2. 큰 숫자가 존재하는 인덱스 위치와 동일하게 각 배열 안의 숫자들의 위치를 수정하기
    for (int[] size : sizes) {
      int temp = 0;
      if (index == 0) {
        if (size[index] < size[index + 1]) {
          temp = size[index];
          size[index] = size[index + 1];
          size[index + 1] = temp;
        }
      } else {
        if (size[index] < size[index - 1]) {
          temp = size[index];
          size[index] = size[index - 1];
          size[index - 1] = temp;
        }
      }
    }

    // 3. 가로와 세로에서 가장 큰 숫자 저장하기
    for (int[] size : sizes) {
      if (a < size[0]) {
        a = size[0];
      }

      if (b < size[1]) {
        b = size[1];
      }
    }

    answer = a * b;

    return answer;
  }
}