import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        
        Arrays.sort(indices);
        for(int i = indices.length - 1; i >= 0; i--) {
            answer.deleteCharAt(indices[i]);
        }
        return answer.toString();
    }
}