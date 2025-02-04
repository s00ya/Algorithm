class Solution {
    public int[] solution(String myString) {
        String[] sp = myString.split("x", -1);
        int[] answer = new int[sp.length];
        for(int i = 0; i < sp.length; i++) {
            answer[i] = sp[i].length();
        }
        return answer;
    }
}