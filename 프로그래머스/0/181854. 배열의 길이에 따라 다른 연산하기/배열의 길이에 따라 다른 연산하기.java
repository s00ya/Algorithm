class Solution {
    public int[] solution(int[] arr, int n) {
       
        int a = arr.length;
        if(a % 2 == 0) {
            for(int i = 1; i < arr.length; i = i+2){
                arr[i] += n;
            }
        } else {
            for(int i = 0; i < arr.length; i = i+2){
                arr[i] += n;
            }
        }
        return arr;
    }
}