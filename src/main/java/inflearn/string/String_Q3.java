package inflearn.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class String_Q3 {
    public static void main (String[] args){
        String_Q3 q = new String_Q3();

        Scanner sc = new Scanner(System.in);

        String param = sc.nextLine();
        // split , 최대값
        System.out.println(q.solution(param));
        //indexof() , substring
        System.out.println(q.solution2(param));
    }

    public String solution(String param) {
        String answer ="";
        int min = Integer.MIN_VALUE; // 가장 작은값으로 초기화

        String[] split = param.split(" ");
        for(String x : split){
            int len = x.length();
            //최대값 구하는 로직
            if(len>min){
                min=len;
                answer=x;
            }
        }

        return answer;
    }
    public String solution2(String param) {
        String answer ="";
        int min = Integer.MIN_VALUE, pos; // 가장 작은값으로 초기화

        while((pos=param.indexOf(" ")) != -1){ //띄어쓰기의 위치를 pos 에 저장 발견 못하면 -1
            String temp = param.substring(0,pos);
            int len = temp.length();
            if(len>min){
                min = len;
                answer = temp;
            }
            param = param.substring(pos+1);
        }
        if(param.length() > min) answer= param;

        return answer;
    }
}
