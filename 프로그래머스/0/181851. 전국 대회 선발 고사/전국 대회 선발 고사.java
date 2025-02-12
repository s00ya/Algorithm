import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < attendance.length; i++) {
            if(attendance[i] == true) {
                list.add(i);
            }
        }
        Collections.sort(list, (a, b) -> Integer.compare(rank[a], rank[b]));
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        answer = a * 10000 + b * 100 + c;
        
        return answer;
    }
}