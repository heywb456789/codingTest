package inflearn.string;

import java.util.Scanner;

public class String_Q7 {
    public static void main(String[] args){
        String_Q7 q = new String_Q7();
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        System.out.println(q.solution(str));
    }

    private String solution(String str) {
        String answer = "NO";

        String sb = new StringBuilder(str).reverse().toString().toUpperCase();

        if(str.equals(sb)){
            answer = "YES";
        }

        return answer;
    }
}
