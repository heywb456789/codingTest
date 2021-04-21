package programmers.stack_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 선언  Queue<Integer> queue = new LinkedList<>();
 *
 * 제일 처음 값 꺼내기
 * queue.peer();
 *
 * 추가
 * queue.offer();
 *
 * 반환 (반환하구 제거 비어있으면 null)
 * queue.poll();
 *
 * 제거
 * queue.remove();
 *
 * 초기화
 * queue.clear();
 */
public class StackQueueQ1 {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int [] truck_weights = {7,4,5,6};
        solution( bridge_length, weight, truck_weights);
    }

    private static void solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> qu  = new LinkedList<>();


        System.out.println(answer);
    }

}
