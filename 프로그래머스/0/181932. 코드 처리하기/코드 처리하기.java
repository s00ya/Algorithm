class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char a = code.charAt(i);
            int b = i % 2;
            if(mode == 0) {
                if (a != '1')  {
                    if(b == 0) {
                    answer += a;
                    }
                } else if(a == '1') {
                    mode = 1;
                }
            } else {
                 if (a != '1')  {
                     if(b == 1) {
                    answer += a;
                     }
                } else if(a == '1'){
                     mode = 0;
                 }
            }
        }
        if(answer.length() == 0) {
            answer = "EMPTY";
        }
        return answer;
    }
}