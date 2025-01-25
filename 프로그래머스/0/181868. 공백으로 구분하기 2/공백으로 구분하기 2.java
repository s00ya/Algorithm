class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        // 앞 뒤 공백 제거 후 연속 공백 처리
        answer = my_string.trim().split("\\s+");
        return answer;
    }
}