package inflearn.array;

import java.util.Scanner;

public class Array_Q9 {
    public static void main(String[] args){
        Array_Q9 q = new Array_Q9();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for(int i =0 ;i<size ; i++){
            for(int j=0; j< size ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(q.solution(arr, size));
    }

    private int solution (int[][] arr, int size){
        int answer = Integer.MIN_VALUE;
        int tmp, tmp2;
        for(int i =0; i< size ; i++ ){
            tmp = 0;
            tmp2 = 0;
            for(int j=0; j< size ; j++){
                tmp += arr[i][j];
                tmp2 += arr[j][i];

            }
            answer = Math.max(answer,tmp);
            answer = Math.max(answer,tmp2);
        }
        //대각선
        tmp = tmp2 = 0;
        for(int i=0; i<size ; i++){
            tmp += arr[i][i];
            tmp2 += arr[i][size-i-1];
        }
        answer = Math.max(answer,tmp);
        answer = Math.max(answer,tmp2);
        return answer;
    }
}
