import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            if(String.valueOf(i).matches("[05]+")) {
                arr.add(i);
            }
        }
        if (arr.isEmpty()) return new int[]{ -1 };
               
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);  
        }
        return answer;
    }
}