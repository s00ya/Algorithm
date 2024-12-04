import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> sco = new PriorityQueue<>();
        int answer = 0;
        
        for(int s : scoville) {
            sco.add(s);
        }
        //가장 작은 값이 K보다 작을 동안 반복
        while(sco.peek() < K) {
            // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우(K보다 작고, 큐에 한개만 남았을 때)
            if (sco.size() == 1) {
                return -1;
        }
            //새로운 음식
            int low = sco.poll();
            int low2 = sco.poll();
            int nsco = low + (low2 * 2);
            sco.add(nsco);
            answer++;
            
        }
        return answer;
    }
}