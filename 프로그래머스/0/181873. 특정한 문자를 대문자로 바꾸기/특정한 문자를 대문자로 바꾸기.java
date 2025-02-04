class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char a = alp.charAt(0);
        for(int i = 0; i < my_string.length(); i++) {
            char b = my_string.charAt(i);
            if(a == b) {
                answer += Character.toUpperCase(b);
            } else {
                answer += b;
            }
        }
        return answer;
    }
}