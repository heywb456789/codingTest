package inflearn.string;

import java.util.*;
import java.util.stream.Collectors;

public class String_Q6 {

    public static void main(String[] args){
        String_Q6 q = new String_Q6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(q.solution(str));
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
}
