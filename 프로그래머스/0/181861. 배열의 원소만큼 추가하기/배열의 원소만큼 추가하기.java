class Solution {
    public int[] solution(int[] arr) {

        int a = 0;
        // 새로 생길 배열
        for(int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        int[] answer = new int[a];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
    }
        
        return answer;
    }
}