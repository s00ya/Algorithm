import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                if(!list.isEmpty()) {
                    answer -= list.remove(list.size() - 1);
                }
            } else {
                int n = Integer.parseInt(arr[i]);
                list.add(n);
                answer += n;
            }
        }
        return answer;
    }
}