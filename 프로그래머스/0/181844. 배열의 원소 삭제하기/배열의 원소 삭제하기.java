import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> delete_set = new HashSet<>();
        for(int i : delete_list) {
            delete_set.add(i);
        }
        for(int i : arr) {
            if(!delete_set.contains(i)) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(a -> a).toArray();
    }
}