package programmers.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting_Q1 {
    public static void main (String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int [] result = solution(array,commands);
    }

    private static int[] solution (int[] array, int[][]result){
        int[] answer = new int[result.length];

        for(int i = 0 ; i < result.length ; i++){
            List<Integer> list = new ArrayList<Integer>();
            int start = result[i][0];
            int end = result[i][1];
            int position = result[i][2];
            for(int k = start -1 ; k < end ; k++){
                list.add(array[k]);
            }
            list.sort(Comparator.naturalOrder());

            answer[i] = list.get(position-1);
        }
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }


}
