package inflearn.string;

import java.util.*;
import java.util.stream.Collectors;

public class String_Q6 {

    public static void main(String[] args){
        String_Q6 q = new String_Q6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(q.solution(str));
        System.out.println(q.solution2(str));
    }

    private String solution(String str) {
        String answer ="";
        List<Character> list = new ArrayList<>();
        for(char a : str.toCharArray()){
            list.add(a);
        }

        list = list.stream().distinct().collect(Collectors.toList());
        for(Character a : list){
            answer += a ;
        }
        return answer;
    }
    //indexof 는 가장 처음 나오는 문자 위치를 기억한다.
    private String solution2(String str){
        String answer ="";

        for(int i=0; i<str.length() ; i++){
//            System.out.println(str.charAt(i)+ " "+i + " "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}
