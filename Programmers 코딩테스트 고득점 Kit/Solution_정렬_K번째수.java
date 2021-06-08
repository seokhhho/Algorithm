import java.util.Arrays;

class Solution_정렬_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ;  i < commands.length ; i++){
            int[] tmpArr = new int[commands[i][1]-commands[i][0]+1];
            int tmpIdx = 0;
            for(int idx = commands[i][0] ; idx <= commands[i][1] ; idx++){             
                tmpArr[tmpIdx++] = array[idx-1];
            }
            Arrays.sort(tmpArr);
            answer[i] = tmpArr[commands[i][2]-1];
        }
        return answer;
    }
}