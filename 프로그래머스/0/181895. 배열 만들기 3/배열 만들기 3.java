import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        int a = intervals[0][0];
        int b = intervals[0][1];
        int c = intervals[1][0];
        int d = intervals[1][1];
        for(int i = a; i <= b; i++) {
            answer.add(arr[i]);
        }
        for(int i = c; i <= d; i++) {
            answer.add(arr[i]);
        }
        int[] result = answer.stream().mapToInt(i -> i).toArray();
        return result;
    }
}