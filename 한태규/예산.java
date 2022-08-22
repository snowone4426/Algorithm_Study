import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int x:d) {
            if((budget -= x) < 0) break;
            answer++;
        }
        
        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/12982