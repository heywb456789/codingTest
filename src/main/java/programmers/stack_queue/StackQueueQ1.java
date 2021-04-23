package programmers.stack_queue;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

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
 *
 * 해당 큐의 맨 앞에 있는 값을 반환 (큐가 비어있으면 null )
 * queue.peek();
 */
public class StackQueueQ1 {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int [] truck_weights = {7,4,5,6};
//        int [] truck_weights = {10};

//        bridge_length = 100;
//        weight = 100;



        solution( bridge_length, weight, truck_weights);
    }

    /**
     *
     * boxed()
     * public final Stream<Integer> boxed() {
     *         return mapToObj(Integer::valueOf);
     *     }
     */
    private static void solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
//        List<Integer> list = Arrays.stream(truck_weights).boxed().collect(Collectors.toList());

        //사다리
        Queue<Truck> bridge = new LinkedList<>();

        //트럭 순서
        Queue<Truck> trucks = new LinkedList<>();

        for(int a : truck_weights) {
            Truck t = new Truck();
            t.weight = a;
            t.timer = 0;
            trucks.offer(t);
        }
        int flag = 0;
        while(true){
            if(trucks.size() <= 0 && bridge.size() <= 0){
                break;
            }

            if(bridge.peek() == null){

                flag += trucks.peek().weight;
                bridge.offer(trucks.poll());
            }else{
                if(bridge.size() > 0) {
                    if (bridge.peek().timer >= bridge_length) {
                        flag -= bridge.peek().weight;
                        bridge.poll();
                    }
                }

                // 시간 +1 값이 다리 사이즈면 리턴
                if(trucks.size() > 0) {
                    if (flag + trucks.peek().weight <= weight) {
                        flag += trucks.peek().weight;
                        bridge.offer(trucks.poll());
                    }
                }

            }

            increase(bridge);

            answer++;

        }

        System.out.println(answer);
    }

    private static void increase(Queue<Truck> bridge) {
        Queue<Truck> temp = new LinkedList<>();
        Truck t = new Truck();
        for(Truck a : bridge){
            t=a;
            t.timer += 1;
            temp.offer(t);
        }
        bridge = temp;
    }


}

class Truck{

    int weight ;
    int timer;

}
