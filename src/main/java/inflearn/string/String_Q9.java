package inflearn.string;

import java.util.Scanner;

public class String_Q9 {
    public static void main(String[] args){
        String_Q9 q = new String_Q9();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(q.solution(str));
    }

    private int solution(String str) {
        int answer = 0;

        str = str.replaceAll("[^0-9]","");

        answer = Integer.parseInt(str);

        return answer;
    }


}
