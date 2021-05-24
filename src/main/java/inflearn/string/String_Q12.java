package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_Q12 {

    public static void main(String[] args){
        String_Q12 q  = new String_Q12();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String secret = sc.next();

        System.out.println(q.solution(size,secret));
    }

    private String solution(int size , String secret){
        String answer = "";

        size = size * 7 ;
        for(int i=0 ; i<size ; i= i+7){
            String tmp = secret.substring(i,i+7).replace('#','1').replace('*','0');
//            tmp= tmp.replaceAll("[#]","1");
//            tmp= tmp.replaceAll("[*]","0");
            int a = Integer.parseInt(tmp,2);
            char b = (char) a;
            answer += String.valueOf(b);
        }
        return answer;
    }
}
