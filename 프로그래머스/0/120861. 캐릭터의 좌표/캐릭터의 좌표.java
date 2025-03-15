class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xlimit = board[0] / 2;
        int ylimit = board[1] / 2;
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("up") && answer[1] < ylimit){
               answer[1]++; 
            } else if(keyinput[i].equals("down") && answer[1] > -ylimit){
                answer[1]--;
            } else if(keyinput[i].equals("left") && answer[0] > -xlimit) {
                answer[0]--;
            } else if(keyinput[i].equals("right") && answer[0] < xlimit) {
                answer[0]++;
            }
        }
        return answer;
    }
}