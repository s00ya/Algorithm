class Solution {
    public int[] solution(int[] num_list) {
        
        int l = num_list.length;
        int j = num_list[l - 1];
        int k = num_list[l- 2];
        int num;
        
            if(j > k) {
                num = j - k;
                
        } else {
                num = j * 2;
        
            }
        int[] answer = new int[l + 1];
        for(int i = 0; i < l; i++) {
            answer[i] = num_list[i];
        }
        answer[l] = num;
        return answer;
    }
}