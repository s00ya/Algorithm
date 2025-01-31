class Solution {
    public String solution(String my_string, int n) {
        char[] answer = new char[my_string.length() * n];
        int index = 0;
        
        for(char c : my_string.toCharArray()) {
            for(int i = 0; i < n; i++) {
                answer[index++] = c;
            }
        }
        return new String(answer);
    }
}