package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Hash_Q2 {
    public static void main(String [] args){
//        String [] values = {"119", "97674223", "1195524421"};
//        String [] values ={"123", "456", "789"};
        String [] values ={"12","123","1235","567","88"};

//        solution(values);
        solution2(values);
    }

    private static boolean solution(String[] values) {

        for(int i=0 ; i < values.length-1 ; i++){
            for(int j=i+1; j<values.length; j++){
                if(values[i].startsWith(values[j])) {return false;}
                if(values[j].startsWith(values[i])) {return false;}
            }
        }
        return true;
    }

    /**
     * 인터넷 참고 소스
     * https://developerdk.tistory.com/11
     * 배열의 저장된 문자열을 가져와 문자열을 잘라서 저장한다.
     * -> key 중복은 자연스럼게 제거
     *
     * contains로 체크 가능
     */
    public static boolean solution2(String[] phone_book){
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int inx = 0; inx < phone_book.length; inx++) {
            for(int jnx = 1; jnx < phone_book[inx].length(); jnx++) {
                map.put(phone_book[inx].substring(0, jnx), 1);
            }
        }

        for(int inx = 0; inx < phone_book.length; inx++) {
            if(map.containsKey(phone_book[inx])) {
                answer = false;
                break;
            } else {
                map.put(phone_book[inx], 1);
            }
        }
        return answer;
    }



}
