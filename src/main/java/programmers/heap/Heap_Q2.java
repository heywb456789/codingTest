package programmers.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap_Q2 {
    public static void main (String[] args){
        int[][] params = {{0,3},{2,6},{1,9}};

        int result = solution(params);
        System.out.println(result);
    }

    private static int solution(int[][] jobs) {
        int answer = 0;
		int len = jobs.length; // 수행되고난 직후의 시간
		int time = 0; // jobs 배열의 인덱스
		int idx = 0; // 수행된 요청 갯수

        // 요청시간 오름차순 정렬
        Arrays.sort(jobs,(o1, o2) -> o1[0] - o2[0]);

        // 처리 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while(idx < len || !pq.isEmpty()){
            while (idx < len && jobs[idx][0] <= time){
                pq.offer(jobs[idx++]);
            }
            if(pq.isEmpty()){
                time = jobs[idx][0];
            }else{
                int[] job = pq.poll();
                answer += time -job[0] + job[1];
                time += job[1];
            }
        }
        return answer / len;
    }
}
