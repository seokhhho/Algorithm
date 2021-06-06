import java.util.*;

class Solution_해시_완주하지 못한 선수 {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String,Integer> player = new HashMap<>();
        
        for(String i : participant) player.put(i,player.getOrDefault(i,0)+1);
        for(String i : completion) player.put(i,player.get(i)-1);
        
       for(String key :player.keySet()){
           if(player.get(key) != 0)
               return key;
       }
       return ""; 
    }
}