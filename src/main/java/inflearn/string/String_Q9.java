package inflearn.string;

import java.util.Scanner;

public class String_Q9 {
    public static void main(String[] args){
        String_Q9 q = new String_Q9();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

//        System.out.println(q.solution(str));
//        System.out.println(q.solution2(str));
        System.out.println(String.valueOf(q.solution3(str)));
    }

    private int solution(String str) {
        int answer = 0;

        str = str.replaceAll("[^0-9]","");

        answer = Integer.parseInt(str);

        return answer;
    }

    private int solution2(String str){
        int answer = 0;

        for(char a : str.toCharArray()){
            if (a >=48 && a<= 57){
                answer = answer * 10 + (a - 48) ;
            }
        }

        return answer ;
    }

    private int solution3(String str){
        int answer = 0;

        for(char a : str.toCharArray()){
            if (Character.isDigit(a)){
                answer+= a;
            }
        }

        return answer ;
    }

}
