package inflearn.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Q1 {
    public static void main(String[] args){
        Array_Q1 q = new Array_Q1();
        Scanner sc = new Scanner(System.in);

//        int size = sc.nextInt();
//        int flag = 0;
//        String answer = "";
//        for(int i=0; i<size ; i++){
//            int var = sc.nextInt();
//            if(flag < var){
//                answer+= var + " ";
//            }
//            flag = var ;
//        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : q.solution(n,arr)) {
//            System.out.println(q.solution());
            System.out.println(x+ " ");
        }
    }

    private ArrayList<Integer> solution(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for(int i=1 ; i<n ; i++){
            if(arr[i]> arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

}
