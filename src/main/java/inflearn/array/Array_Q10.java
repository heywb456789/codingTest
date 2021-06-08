package inflearn.array;

import java.util.Scanner;

public class Array_Q10 {
    public static void main(String[] args){
        Array_Q10 q = new Array_Q10();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] arr = new int[size+2][size+2];
        for(int i=1 ; i<=size ; i++){
            for(int j=1 ; j<=size ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(q.solution(arr, size));
    }

    private int solution(int[][] arr, int size) {
        int answer = 0;

        for(int i=1 ; i<=size ; i++){
            for(int j=1 ; j<=size ; j++){
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]){
                    answer++;
                }
            }
        }

        return answer;
    }

}
