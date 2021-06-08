package inflearn.array;

import java.util.Scanner;

public class Array_Q11 {
    public static void main(String[] args){
        Array_Q11 q = new Array_Q11();
        Scanner sc =new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for(int i =0 ; i<size; i++){
            for(int j=0; j<size ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(q.solution(size , arr));
    }

    private int solution(int size , int[][]arr){
        int answer = 0;

        for(int i = 0 ; i < size ; i++){

        }

        return answer;
    }
}
