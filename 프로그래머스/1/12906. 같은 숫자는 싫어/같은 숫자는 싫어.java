import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        //int[] answer = {};
        Stack<Integer> stack = new Stack<>(); //스택 선언
        
        //배열 순회
        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty() || stack.peek() != arr[i]) { // 스택이 비어있거나 최상위 원소와 값이 같지 않을 때
                stack.push(arr[i]); //스택에 추가
            }
        }
        
        int[] answer = new int[stack.size()];
        int point = stack.size() - 1;
        
        //스택 데이터를 역순 저장
        while(!stack.isEmpty()) {
            answer[point--] = stack.pop();
        }

        return answer;
    }
}