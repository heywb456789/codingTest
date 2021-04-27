package programmers.stack_queue;

import java.util.*;

public class StackQueueQ4 {
    public static void main (String[] args) {
        int location = 2;
//        int location = 0;
        int[] priorities = {2, 1, 3, 2};
//        int[] priorities = {1, 1, 9, 1, 1, 1};
        int num = solution2(priorities, location);
        System.out.println(num);
    }

    private static int solution(int[] priorities, int location) {
        int answer =0;
        List<Print> l = new ArrayList<Print>();
        for(int i=0; i<priorities.length ; i++){
            Print p = new Print();
            p.priorities = priorities[i];
            p.location = i;
            l.add(p);
        }

        while(true){
            int flag = 0;
            for(int i=0; i<l.size(); i++){
                for(int j = i+1; j< l.size() ; j++) {
                    if (l.get(i).priorities < l.get(j).priorities) {
                        flag++;
                        l.add(l.get(i));
                        l.remove(l.get(i));
                        break;
                    }
                }
                if(flag > 0){
                    break;
                }
            }

            if(flag <=0){
                break;
            }
        }

        for(int z = 0 ; z<l.size() ; z++){
            if(l.get(z).location == location){
                answer = l.indexOf(l.get(z)) +1;
                break;
            }
        }

        return answer;

    }

    private static int solution2(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}

class Print{
    int priorities;
    int location;
}
