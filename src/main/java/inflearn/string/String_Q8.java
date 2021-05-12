package inflearn.string;

import java.util.Scanner;

public class String_Q8 {
    public static void main(String[] args){
        String_Q8 q = new String_Q8();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();

        System.out.println(q.solution(str));
    }

    private String solution(String str) {
        String answer = "NO";

        str = str.replaceAll("[^A-Z]","");
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            answer ="YES";
        }
//        str = str.replaceAll("[^a-zA-Z\\s]","");
//        String[] split = str.split(" ");

//        int i=0;
//        int len = split.length -1 ;
//        while(i < len){
//            String rstr = new StringBuilder(split[len]).reverse().toString();
//            if(split[i].equals(rstr)){
//                answer = "YES";
//            }else{
//                answer="NO";
//            }
//            i++;
//            len--;
//        }

        return answer;
    }
}
