class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        int c = 0;
        int d = 0;
        
        answer = (a > b) ? 1 : -1;
        if(a == b) {
            for(int i = 0; i < arr1.length; i++) {
                c += arr1[i];
                d += arr2[i];
            }
            if(c > d) {
                return 1;
            } else if(c < d) {
                return -1;
            }
            return 0;
        }
        return answer;
    }
}