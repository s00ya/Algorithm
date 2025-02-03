import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : answer) {
            if(!str.isEmpty()) {
                list.add(str);
            }
        }
        if(list.isEmpty()) {
            list.add("EMPTY");
        }
        
        return list.toArray(new String[0]);
    }
}