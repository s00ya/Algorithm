import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for(int k = 0; k < arr[i]; k++) {
                    if(!answer.isEmpty()) {
                        answer.remove(answer.size() - 1);
                    }
                }
            }
        } 
        return answer.stream().mapToInt(i -> i).toArray();
    }
}