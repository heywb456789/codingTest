package inflearn.array;

import java.util.Scanner;

public class Array_Q7 {
    public static void main (String[] args){
        Array_Q7 q = new Array_Q7();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0; i< size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(q.solution(arr));
    }

    private int solution(int[] arr){
        int answer = 0;
        int tmp =0;
        for(int i=0; i< arr.length ; i++){
            if(arr[i] == 0){
                tmp =0;
            }else{
                tmp++;
                answer += tmp;
            }
        }

        return answer;
    }
}
