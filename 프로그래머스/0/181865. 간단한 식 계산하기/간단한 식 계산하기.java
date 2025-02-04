class Solution {
    public int solution(String binomial) {
        if(binomial.contains(" + ")) {
            String[] a = binomial.split(" \\+ ");
            return Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
        } else if(binomial.contains(" - ")) {
            String[] a = binomial.split(" \\- ");
            return Integer.parseInt(a[0]) - Integer.parseInt(a[1]);
        } else if(binomial.contains(" * ")) {
            String[] a = binomial.split(" \\* ");
            return Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
        }
    
        return 0;
    }
}