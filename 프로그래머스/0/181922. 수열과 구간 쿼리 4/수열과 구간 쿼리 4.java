class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int a = s; a <= e; a++) {
                if(a % k == 0) {
                    arr[a] += 1;
                }
            }
        }
        return arr;
    }
}