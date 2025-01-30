class Solution {
    public int[] solution(int start_num, int end_num) {
        int a = end_num - start_num + 1;
        int[] arr = new int[a];
        for(int i = start_num; i <= end_num; i++) {
            arr[i - start_num] = i;
        }
        return arr;
    }
}