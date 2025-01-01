class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum1 = Integer.parseInt("" + a + b);
        int sum2 = Integer.parseInt("" + b + a);
        return Math.max(sum1, sum2);
    }
}