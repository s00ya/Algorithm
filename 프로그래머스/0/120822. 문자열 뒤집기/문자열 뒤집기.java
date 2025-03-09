class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int a = arr.length;
        
        for(int i = 0; i < a / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[a - 1 - i];
            arr[a - 1 - i] = temp;
        }
        return new String(arr);
    }
}