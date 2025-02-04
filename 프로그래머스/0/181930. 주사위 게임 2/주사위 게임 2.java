class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int d = a+b+c;
        int e = (a * a + b * b + c * c);
        int f =  (a * a * a + b * b * b + c * c * c);
        
        if(a != b && b != c && a != c) {
            answer = d;
        } else if(a == b && b == c && a == c) {
            answer = d * e * f;
                
        } else { 
            answer = d * e;
        } 
        return answer;
    }
}