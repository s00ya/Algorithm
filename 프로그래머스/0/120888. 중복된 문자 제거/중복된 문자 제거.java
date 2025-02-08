import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            String s = String.valueOf(my_string.charAt(i));
            if(!list.contains(s)) {
                list.add(s);
            }
        }
        for(String s : list) {
            answer += s;
        }
        return answer;
    }
}