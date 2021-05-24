package inflearn.array;

import java.util.Scanner;

public class Array_Q6 {
    public static void main(String[] args){
        Array_Q6 q = new Array_Q6();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(q.solution(arr));
    }
    public String solution(int[] arr){
        String answer = "";

        for(int i =0; i<arr.length ; i++){
            String re = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            int reInt = Integer.parseInt(re);
            answer = this.isPrime(reInt, answer);
        }
        answer = answer.substring(0,answer.length()-1);
        return answer;

    }

    private String isPrime(int reInt, String answer) {
        if(reInt < 2){
            return answer;
        }
        else if(reInt == 2) {
            answer += 2 + " ";
        }
        else {
            int cnt = 0;
            for (int i = 2; i < Math.sqrt(reInt); i++) {
                if (reInt % i == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt <= 0) {
                answer += reInt + " ";
            }
        }
        return answer;
    }
}
