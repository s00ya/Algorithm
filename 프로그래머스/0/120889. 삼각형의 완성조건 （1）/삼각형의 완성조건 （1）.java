import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int a = sides[0] + sides[1];
        if(sides[2] < a) {
            return 1;
        }
        return 2;
    }
}