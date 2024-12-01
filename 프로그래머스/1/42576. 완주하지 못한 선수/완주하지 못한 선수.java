import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 배열 정렬(오름차순)
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i]; //불일치 발생 시 반환
            }
        }
        // 순회하는 동안 불일치가 없으면 마지막 참가자가 반환
        return participant[participant.length - 1];
    }
}