package inflearn.string;

import java.util.Scanner;

/**
 * 설명
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력한다.
 *
 * foreach 에는 iterator를 제공하는 collection 프레임워크만 올 수 있다.
 */
public class String_Q1 {
    public static void main(String[] args){
        String_Q1 q1 = new String_Q1();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char flag = sc.next().charAt(0);

        q1.solution(input, flag);
//        input = input.toUpperCase();
//        flag = Character.toUpperCase(flag);
//        int cnt = 0;
//        for(int i = 0 ; i < input.length(); i++){
//            if(flag == input.charAt(i)){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
    }

    public int solution(String str, char c){
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        int cnt = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(c == str.charAt(i)){
                cnt++;
            }
        }
        //forEach는
        //문자 배열을 생성해서 반복 돌릴수도 있다.
//        for(char x : str.toCharArray()){
//            if(c == x){
//                cnt++;
//            }
//        }
        System.out.println(str);


        return answer;
    }
}
