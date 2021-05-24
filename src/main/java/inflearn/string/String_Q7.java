package inflearn.string;

import java.util.Scanner;

public class String_Q7 {
    public static void main(String[] args){
        String_Q7 q = new String_Q7();
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

//        System.out.println(q.solution(str));
        System.out.println(q.solution2(str));
    }

    /**
     * equals() 문자열 값 같은지
     * equalsIgnoreCase() 문자열 비교에서 대소문자 무시
     *
     * compare() 문자열 길이가 같은지 
     */
    private String solution(String str) {
        String answer = "NO";

//        String sb = new StringBuilder(str).reverse().toString().toUpperCase();
        String sb = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(sb)){
            answer = "YES";
        }

        return answer;
    }

    private String solution2(String str){
        String answer = "YES";
        str = str.toUpperCase();
        for(int i=0; i<str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length() - i -1)){
                answer ="NO";
                return answer;
            }
        }

        return answer;
    }
}
