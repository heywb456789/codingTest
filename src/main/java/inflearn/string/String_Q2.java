package inflearn.string;

import java.util.Scanner;

public class String_Q2 {
    public static void main(String[] args){
        String_Q2 q = new String_Q2();
        Scanner sc  = new Scanner(System.in);

        String param = sc.next();

        System.out.println("s1 : " + q.solution(param));
        System.out.println("s2 : " + q.solution2(param));

    }

    public String solution(String param) {
        String answer ="";
        for(char c : param.toCharArray()){
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }
        return answer;
    }

    public String solution2(String param){
          String answer ="";
        for(char c : param.toCharArray()){
            if(c >= 65 && c<= 90){
//                answer += String.valueOf(c).toLowerCase();
                answer += (char)(c + 32);
            }
            else if (c >= 97 && c<=122){
//                answer += String.valueOf(c).toUpperCase();
                answer += (char)(c - 32);
            }
            else {
                answer += answer;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
