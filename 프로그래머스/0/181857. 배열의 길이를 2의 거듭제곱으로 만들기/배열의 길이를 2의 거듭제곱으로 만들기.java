class Solution {
    public int[] solution(int[] arr) {
        int a = arr.length;
        while((a & (a - 1)) != 0) {
            a++;
        }
        int[] answer = new int[a];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}