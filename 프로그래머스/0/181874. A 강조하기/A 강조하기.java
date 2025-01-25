class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            char a = myString.charAt(i);
            
            if(a == 'a') {
                answer += Character.toUpperCase(a);
            } else if(Character.isUpperCase(a) && a != 'A') {
                answer += Character.toLowerCase(a);
            } else {
                answer += a;
            }
        }
        return answer;
    }
}