class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int index = array[j];
                    answer[0] = index;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}