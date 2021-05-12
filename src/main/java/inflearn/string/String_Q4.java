package inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Q4 {
    public static void main(String[] args){
        String_Q4 q = new String_Q4();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String[] arr = new String[size];

        for(int i=0; i<size ; i++){
            arr[i] = sc.next();
        }
        //s1
//        for(String x : q.solution(size,arr)){
//            System.out.println(x);
//        }
        //s2
        for(String x : q.solution2(size,arr)){
            System.out.println(x);
        }

    }

    /**
     *
     * 특정 조건에서의 문자열 뒤집기
     */
    private ArrayList<String> solution2(int size, String[] arr) {
        ArrayList<String>answer = new ArrayList<>();
        for(String x : arr){
            char[] s = x.toCharArray();
            int i = 0;
            int len = x.length()-1;
            while(i < len){
                char tmp= s[i];
                s[i] = s[len];
                s[len] = tmp;
                i++;
                len--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    /**
     *
     * String 은 그자체로는 변경이 불가능하기 때문에 조작이 일어 날때마다 새로운 객체를 생성한다.
     */
    private ArrayList<String> solution(int size, String[] arr) {
        ArrayList<String>answer = new ArrayList<>();

        for(String s : arr){
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }


}
