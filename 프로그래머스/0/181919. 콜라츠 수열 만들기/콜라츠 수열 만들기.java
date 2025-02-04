import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
                list.add(n);
                
            } else {
                n = (n * 3) + 1;
                list.add(n);
            }
       }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}