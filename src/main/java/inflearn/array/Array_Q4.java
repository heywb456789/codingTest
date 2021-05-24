package inflearn.array;

import java.util.Scanner;

public class Array_Q4 {
    public static void main(String[] args){
        Array_Q4 q = new Array_Q4();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        System.out.println(q.solution(size));
    }
    private String solution(int size){
        String answer = "";
        int[] array = new int[size] ;

        for(int i =0 ; i< size ; i++){
            if(i-2 < 0 ){
                array[i] = 1;
                answer += 1 + " ";
            }
            else{
                array[i] = array[i-2] + array[i-1];
                answer += array[i] + " ";
            }
        }

        return answer;
    }
}
