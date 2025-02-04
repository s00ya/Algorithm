class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int i = 0;
        while(i <= myString.length() - pat.length()) {
            if(myString.substring(i, i + pat.length()).equals(pat)) {
                answer++;
                i += 1;
            } else {
                i++;
            }
        }
        return answer;
    }
}