package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class String_Q10 {
    public static void main (String[] args){
        String_Q10 q = new String_Q10();
        Scanner sc  = new Scanner(System.in);

//        String str = sc.nextLine();
//
//        System.out.println(q.solution(str));
        // 0 -> 와 length -> 0 으로 돌면서 작은값으로
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(q.solution2(str, t));

    }
    private int[] solution2(String str, char t){
        int[] answer = new int[str.length()];

        int p = 1000;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == t){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for(int i= str.length()-1 ; i>= 0; i--){
            if(str.charAt(i) == t){
                p=0;
            }else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        return  answer;
    }
    private String solution(String str){
        String answer = "";

        String[] split = str.split(" ");

        String strLine = split[0];
        char flag = split[1].charAt(0);

        List<Integer> index = new ArrayList<>();
        for(int j = 0; j<strLine.length(); j++){
            if(strLine.charAt(j) == flag){
                index.add(j);
            }
        }


        int[] result = new int[strLine.length()];
        for(int i=0 ; i< strLine.length() ; i++){
            if(strLine.charAt(i)==flag){
                result[i] = 0;
            }else{
                int min = 100;
                for(int a : index){
                    int flag2 = Math.abs(a-i);
                    if(flag2 < min){
                        min = flag2;
                    }
                }
                result[i] = min;
            }
        }
        for(int a : result){
            answer += String.valueOf(a)+" ";
        }
        return answer;
    }
}
