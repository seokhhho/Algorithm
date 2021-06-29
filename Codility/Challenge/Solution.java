import java.util.*;

class Solution {
	public static void main(String[] args) {
		System.out.println(solution("decade",4));
		
	}
	public static String solution(String S, int K) {
		String Answer = "";

		ArrayList<Character> s_sorted = new ArrayList<Character>();
		ArrayList<Integer> s_idx = new ArrayList<Integer>();
		for (int i = 0; i < S.length(); i++) {
			s_sorted.add(S.charAt(i));
		}
		Collections.sort(s_sorted);
		
		char prevCh = ' ';
		int prevIdx = -1;
		
		for (int i = 0; i < s_sorted.size(); i++) {
			if (prevCh == s_sorted.get(i))
				s_idx.add(S.indexOf(s_sorted.get(i), prevIdx + 1));
			else
				s_idx.add(S.indexOf(s_sorted.get(i)));
			prevCh = s_sorted.get(i);
			prevIdx = s_idx.indexOf(i);
		}

		for (int i = 0; i < S.length(); i++) {
			if (s_idx.get(0) <= K) {
				Answer += s_sorted.indexOf(0);
				for(int j = 1 ; j < s_idx.size() ; j++) {
					if(s_idx.indexOf(j) > s_idx.indexOf(0)) {
						s_idx.set(j, s_idx.indexOf(j)-1);
					}
				} 
				K -= s_idx.indexOf(0);
				s_sorted.remove(0);
				s_idx.remove(0);
			}else {
				Answer += s_sorted.indexOf(s_idx.indexOf(0));
				for(int j = 0 ; j < s_idx.size() ; j++) {
					if(s_idx.indexOf(j) > 0 ) {
						s_idx.set(j, s_idx.indexOf(j)-1);
					}
				}
				s_sorted.remove(s_idx.indexOf(0));
				s_idx.remove(s_idx.indexOf(0));
			}
			
		}
		return Answer;
	}
}