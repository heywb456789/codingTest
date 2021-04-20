package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Hash_Q1 {

    public static void main(String[] args){
        String [] participant = new String[]{"leo", "kiki", "eden"};
        String [] completion = new String[]{"kiki", "eden"};
        //solution(participant,completion);
        solution2(participant,completion);
    }

    public static String solution(String[] participant, String[] completion){


        String answer = "";


        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(i =0 ; i < completion.length ; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];

    }

    public static String solution2(String[] participant, String[] completion){
        String answer = "";

        HashMap<String ,Integer> answerMap = new HashMap<String, Integer>();
        for(String a : participant) answerMap.put(a, answerMap.getOrDefault(a,0) + 1);
        for(String b : completion) answerMap.put(b, answerMap.get(b) -1);

        for(String key : answerMap.keySet()){
            if(answerMap.get(key) !=0){
                answer = key;
            }
        }
        return answer;


    }
}
