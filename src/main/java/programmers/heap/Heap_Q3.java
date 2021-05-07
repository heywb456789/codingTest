package programmers.heap;

import java.util.PriorityQueue;

public class Heap_Q3 {
    public static void main(String[] args){
//        String[] operations = {"I 16","D 1"};
//        String[] operations = {"I 7","I 5","I -5","D -1"};
//        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        String[] operations = {"I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1", "I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1"};
        solution(operations);
    }

    private static int[] solution(String[] operations) {
        int[] answer = {};

        PriorityQueue<Integer> result = new PriorityQueue<>();

        for(String s : operations){
            String[] split = s.split("");
            String flag = split[0];

            String number= "";
//            StringBuilder number = new StringBuilder();
            for(int i =2; i< s.length() ; i++){
                number += split[i];
//                number = number.concat(split[i]);
//                number.append(split[i]);
            }

            if("I".equals(flag)){
                result.offer(Integer.parseInt(number));
//                resultMax.offer(Integer.parseInt(number));
            }else{
                if(result.size() > 0) {
                    if (Integer.parseInt(number) > 0) {
                        PriorityQueue<Integer> temp = new PriorityQueue<>();
                        int len = result.size();
                        for (int i = 0; i < len - 1; i++) {
                            temp.offer(result.poll());
                        }
                        result = temp;
                    } else {
                        result.poll();
                    }
                }
            }
        }
        if(result.size() >=1){
            int min = result.poll();
            int len = result.size()-1;
            for(int i =0 ; i < len ; i++){
                result.remove();
            }
            int max = result.size() > 0 ? result.poll() : min;
            answer = new int[]{max,min};
        }else {
            answer = new int[]{0, 0};
        }
        return answer;
    }
}
