package inflearn.array;

import java.util.Scanner;
public class Array_Q5 {
    public static void main(String[] args){
        Array_Q5 q = new Array_Q5();
        Scanner sc = new Scanner(System.in);

        int flag = sc.nextInt();

        System.out.println(q.solution(flag));
        System.out.println(q.solution2(flag));
    }

    /**
     * 에라토스테네스채
     * 처음 시작 숫자를 소수로 취급
     * 기준의 배수들은 배제한다.
     */
    private int solution2(int flag){
        int answer = 0;
        int[] ch = new int[flag+1];
        for(int i=2; i<= flag ; i++){
            if(ch[i] ==0 ){
                answer ++;
                for(int j=i ; j<=flag ;j=j+i){
                    ch[j] = 1;
                }
            }
        }

        return answer;
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
