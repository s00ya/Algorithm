class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum1 = Integer.parseInt("" + a + b);
        int sum2 = (2 * a * b);
        return Math.max(sum1, sum2);
    }
}