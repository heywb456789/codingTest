package programmers.stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackQueueQ2 {
    public static void main(String[] args){
        int[] prices = {1,2,3,2,3};

//        solution(prices);
        solution2(prices);
//        solution(prices);
    }

    private static void solution(int[] prices) {
        List<Integer> result = new ArrayList<>();
        int num = 0;

        for(int i =0 ; i<prices.length ; i++){
            num = prices[i];
            int k=0;
            if( i == prices.length -1){
                result.add(k);
                break;
            }
            for(int j=i+1; j<prices.length ; j++){
                k++;
                int compare = prices[j];
                if(num > compare){
                    result.add(k);
                    break;
                }
                if(j == prices.length -1){
                    result.add(k);
                    break;
                }

            }
        }

        System.out.println(result);

        int[] answer = new int[result.size()];
        Object[] answerArrObj = result.toArray();
        for (int i = 0; i < answerArrObj.length; i++) {
            answer[i] = (int) answerArrObj[i];
        }


        for(int a : answer) {
            System.out.println(a);
        }
    }
    //primitive 배열 선언시 초기값 가지고 있고 String은 null
    //참조타입 은 null
    private static int[] solution2(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        String[] answer1 = new String[len];
        double[] answer2 = new double[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }

    public int[] solution3(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }

}
