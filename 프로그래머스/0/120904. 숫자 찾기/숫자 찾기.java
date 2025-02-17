class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        String s = String.valueOf(k);
        int answer = str.indexOf(s);
        return (answer == -1) ? -1 : answer + 1;
    }
}