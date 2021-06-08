package inflearn.array;

import java.util.ArrayList;
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
        String result = "";
        for(int x : q.solution2(size, arr)){
//            System.out.println(x+" ");
            result +=  x+" ";
        }
        System.out.println(result);
    }

    private ArrayList<Integer> solution2(int n ,int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n ; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp >0 ){
                //제일 뒷자리 부터 가져온다.
                int t = tmp % 10;
                // 10 , 100 , 1000 이런식의 곱셈 효과를 만든다.
                res = res *10 +t;
                //적용중인 기준숫자 사이즈 체크
                tmp = tmp/10 ;
            }

            if(isPrime2(res)) answer.add(res);
        }

        return  answer;
    }
    private boolean isPrime2(int num){
        if(num ==1 )return false;
        for(int i=2; i< num; i++){
            if(num%i==0) return false;
        }
        return true;
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
