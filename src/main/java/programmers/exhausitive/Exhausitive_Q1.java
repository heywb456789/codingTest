package programmers.exhausitive;

import java.util.ArrayList;
import java.util.List;

public class Exhausitive_Q1 {
    public static void main(String[] args){
//        int[] answer = {1,2,3,4,5};
        int[] answer = {1,3,2,4,2};
        int[] result = solution(answer);
    }

    private static int[] solution(int[] answers) {
        int [] first = {1, 2, 3, 4, 5};
        int [] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int [] cnt = new int [3];



        for(int i=0; i< answers.length ; i++){
            if(answers[i] == first[i%first.length]){
                cnt[0]++;
            }
            if(answers[i] == second[i%second.length]){
                cnt[1]++;
            }
            if(answers[i] == third[i%third.length]){
                cnt[2]++;
            }
        }
        int max = cnt[0];
//        for(int j=0 ; j <cnt.length ; j ++){
//            if(max < cnt[j]) {
//                max = cnt[j];
//            }
//        }
        max = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));


        List<Integer> resultList = new ArrayList<Integer>();
        for(int k=0; k < cnt.length ; k++){
            if(max == cnt[k]){
                resultList.add(k+1);
            }
        }
        int[] result = new int[resultList.size()];
        for(int z=0; z <result.length ; z++){
            result[z] = resultList.get(z);
        }

        return result;
    }
}
