import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if(!list.contains(temp)) {
                list.add(temp);
                answer[index++] = temp;
                
                if(index == k) {
                    break;
                }
            }
            
        }
        while(index < k) {
            answer[index++] = -1;
        }
        
        return answer;
    }
}