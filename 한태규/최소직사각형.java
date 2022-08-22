class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_height = 0;
        int max_width = 0;
        
        for (int[] x:sizes) {
            if (x[0] > x[1]) {
                max_height = x[1] > max_height ? x[1] : max_height;
                max_width = x[0] > max_width ? x[0] : max_width;
            } else {
                max_height = x[0] > max_height ? x[0] : max_height;
                max_width = x[1] > max_width ? x[1] : max_width;
            }
        }
        
        answer = max_height * max_width;
        
        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/86491