package inflearn.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Array_Q8 {
    public static void main(String[] args){
        Array_Q8 q = new Array_Q8();
        Scanner sc  = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(q.solution(arr)));
        for(int x : q.solution(arr)){
            System.out.print(x+" ");
        }
    }

    private int[] solution(int[] arr){
        int[] answer = new int[arr.length];
        for(int i=0; i< arr.length ; i++){
            int cnt = 1 ;
            for(int j=0; j<arr.length ; j++){
                if(arr[j] > arr[i]){
                    cnt++;
                }
            }
            answer[i] = cnt ;
        }

        return answer;
    }
}
