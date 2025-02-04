class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
        }
        for(int j = 0; j < index_list.length; j++) {
            int index = index_list[j];
            answer += arr[index];
        }
        return answer;
    }
}