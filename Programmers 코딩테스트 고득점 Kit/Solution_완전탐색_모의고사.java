import java.util.*;

class Solution_완전탐색_모의고사 {
    public int[] solution(int[] answers) {
        
        int[] answer;
        ArrayList<Integer> tmpAns = new ArrayList<Integer>();
        
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = {0,0,0};
        int max = 0;
        
        for(int i = 0 ; i < answers.length ; i++){
            if(student1[i%5] == answers[i]) score[0]++;
            if(student2[i%8] == answers[i]) score[1]++;
            if(student3[i%10] == answers[i]) score[2]++;
        }
        
        max = Integer.max(Integer.max(score[0],score[1]),score[2]);
        
        for(int i = 0 ; i < 3 ; i++){
            if(max == score[i]) tmpAns.add(i+1);
        }
        answer = new int[tmpAns.size()];
        
        for(int i = 0 ; i < tmpAns.size() ; i++){
           answer[i] = tmpAns.get(i);
        }
        return answer;
    }
}