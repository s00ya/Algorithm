import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int arr[] = new int[array.length];
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            arr[i] = Math.abs(array[i] - n);
        }
        
        int min = arr[0];
        answer = array[0];
        
        for(int i = 1; i < array.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                answer = array[i];
            } else if(arr[i] == min && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}