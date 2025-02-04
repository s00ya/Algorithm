class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[strArr.length];
        int[] count = new int[31];
        
        for(int i = 0; i < strArr.length; i++) {
            arr[i] = strArr[i].length();
        }
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] > answer) {
                answer = count[i];
            }
        }
        return answer;
    }
}