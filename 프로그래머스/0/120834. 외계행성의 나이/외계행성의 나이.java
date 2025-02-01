class Solution {
    public String solution(int age) {
        String answer = "";
        char[] uni = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String uniage = String.valueOf(age);
        
        for(int i = 0; i < uniage.length(); i++) {
            int index = Character.getNumericValue(uniage.charAt(i));
            answer += uni[index];
        }
        return answer;
    }
}