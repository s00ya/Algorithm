class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int a = num_list.length;
        
        for(int i = 0; i < a - n; i++) {
            answer[i] = num_list[i+n];
        }
        for(int j = 0; j < n; j++) {
            answer[a - n + j] = num_list[j];
        }
        return answer;
    }
}