package inflearn.array;

import java.util.Scanner;
public class Array_Q5 {
    public static void main(String[] args){
        Array_Q5 q = new Array_Q5();
        Scanner sc = new Scanner(System.in);

        int flag = sc.nextInt();

        System.out.println(q.solution(flag));
    }
    private int solution(int flag){
        int answer = 0;

        for(int i =0; i< flag ; i++){
            if(i < 2){
                continue;
            }
            if(i==2){
                answer++;
                continue;
            }
            int cnt = 0;
            for(int j =2; j <= Math.sqrt(i) ; j++){

                if(i% j ==0){
                    cnt++;
                    break;
                }
            }
            if(cnt <= 0){
                answer++;
            }
        }
        return answer;
    }
}
