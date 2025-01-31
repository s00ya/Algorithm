class Solution {
    public int[] solution(int start_num, int end_num) {
        int index = start_num - end_num + 1;
        int[] answer = new int[index];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = start_num;
            start_num--;
    }
        return answer;
    }
}