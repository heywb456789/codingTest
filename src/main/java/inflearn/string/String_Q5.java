package inflearn.string;

import java.util.Scanner;

public class String_Q5 {
    public static void main(String[] args){
        //65 90 , 97 122;
        String_Q5 q = new String_Q5();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(q.solution(str));

    }

    private String solution(String str) {
        String answer="";

        char[] c = str.toCharArray();
        int i=0;
        int len = str.length()-1;
        while(i < len) {
//            if(Character.isAlphabetic(c[i]) && Character.isAlphabetic(c[len])){
//                char temp = c[len];
//                c[len] = c[i];
//                c[i] = temp;
//            }
//            i++;
//            len--;
            // 문자가 소문자인지
            if (!Character.isAlphabetic(c[i])) {
                i++;
                // 문자가 대문자인지
            } else if (!Character.isAlphabetic(c[len])) {
                len--;
            } else {

                // 알파벳일때 교환
                char temp = c[len];
                c[len] = c[i];
                c[i] = temp;

                i++;
                len--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
}
