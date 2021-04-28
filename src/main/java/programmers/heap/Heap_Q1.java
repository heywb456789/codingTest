package programmers.heap;

import java.util.PriorityQueue;

public class Heap_Q1 {

    //섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    public static void main(String[] args){
//        int[] scoville = {1,2,3,9,10,12};
        int[] scoville = {5};
        int k = 7;
        int result =  solution(scoville, k);
        System.out.println(result);
    }

    private static int solution(int[] scoville, int k) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int a : scoville){
            heap.offer(a);
        }

        while(heap.peek() <= k){
            if(heap.size() ==1){
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a+(b*2);
            heap.offer(result);
            answer ++;
        }

        return answer;
    }
}
