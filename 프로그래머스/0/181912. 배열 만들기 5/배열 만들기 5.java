import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String str : intStrs) {
            int n = Integer.parseInt(str.substring(s, s+l));
            if(n > k) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}