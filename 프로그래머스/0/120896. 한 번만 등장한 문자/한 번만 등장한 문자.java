import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if(cnt == 0) {
                answer += arr[i];
            }
        }
        return answer;
    }
}