package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Dto{
    int progress;
    int speeds;
    int workDay;
}
public class StackQueueQ3 {
    public static void main (String[] args){
        int[] progress = {93,30,55};
        int[] speeds = {1,30,5};
        int[] answer = {};
        answer = solution(progress, speeds);
        for(int a : answer) {
            System.out.println(a);
        }
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> cntList = new ArrayList<>();
        Queue<Dto> q = new LinkedList<>();

        for(int i = 0 ; i<progresses.length ; i++){
            Dto dto = new Dto();
            dto.progress = progresses[i];
            dto.speeds = speeds[i];
            dto.workDay = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            q.offer(dto);
        }
        int cnt = 0;
        int flag = q.peek().workDay;
        while(true) {

            if(q.size() ==0){
                cntList.add(cnt);
                break;
            }

            if(flag >= q.peek().workDay){
                q.poll();
                cnt++;
            }else{
                cntList.add(cnt);
                cnt = 0;
                flag = q.peek().workDay;
            }
        }
        int[] answer = new int[cntList.size()];
        Object[] answerArrObj = cntList.toArray();
        for (int i = 0; i < answerArrObj.length; i++) {
            answer[i] = (int) answerArrObj[i];
        }
        return answer;
    }

}
