class Solution_깊이/너비 우선 탐색(DFS/BFS)_타겟넘버 {
    static int count = 0;
    public int solution(int[] numbers, int target) {
        return calc(0,numbers,target,0);
    }
    
    int calc(int idx , int[] numbers , int target , int sum){
        if(idx >= numbers.length){ 
            return sum == target ? 1 : 0;  
        } 
        return calc(idx+1,numbers,target,sum+numbers[idx]) 
            + calc(idx+1,numbers,target,sum-numbers[idx]); 
    }
    
}