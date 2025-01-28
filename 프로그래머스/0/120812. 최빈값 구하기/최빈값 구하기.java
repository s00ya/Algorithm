import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int[] arr = new int[1000];
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        
        int maxCount = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCount) {
                maxCount = arr[i];
                answer = i;
            } else if (arr[i] == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }
}