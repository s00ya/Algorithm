class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    
        int numer3 = (numer1 * denom2) + (numer2 * denom1);
        int denom3 = denom1 * denom2;
        int max = 0;
        
        for(int i = 1; i <= numer3 && i <= denom3; i++) {
            if(numer3 % i == 0 && denom3 % i == 0) {
                max = i;
            }
        }
        numer3 = numer3 / max;
        denom3 = denom3 / max;
        
        int[] answer = {numer3, denom3};
        return answer;
    }
}