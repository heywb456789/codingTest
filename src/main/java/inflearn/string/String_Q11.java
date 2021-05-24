package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class String_Q11 {
    public static void main (String[] args){
        String_Q11 q = new String_Q11();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(q.solution(str));
//        System.out.println(q.solution2(str));
    }
    private String solution(String str){
        String answer ="";
        char flag = str.charAt(0);
        int cnt =0;
        for(char a : str.toCharArray()){
            if(flag==a){
                cnt ++ ;
            }else{
                answer += String.valueOf(flag);
                if(cnt >1){
                    answer += cnt;
                }
                flag = a;
                cnt=1;
            }

        }
        answer += String.valueOf(flag);
        if(cnt >1){
            answer += cnt;
        }
        return answer;
    }
    private String solution2(String str){
        String answer ="";

        str = str + " ";
        int cnt = 1;

        for(int i =0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }
            else{
                answer += str.charAt(i);
                if(cnt > 1 ){
                    answer+= String.valueOf(cnt);
                    cnt=1;
                }
            }
        }

        return answer;
    }
}
