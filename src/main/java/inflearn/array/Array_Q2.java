package inflearn.array;

import java.util.Scanner;

public class Array_Q2 {
    public static void main(String[] args){
        Array_Q2 q = new Array_Q2();
        Scanner sc =new Scanner(System.in);

        int size = sc.nextInt();
        int flag =0;
        int answer=0;
        for(int i=0; i< size ; i++){
            int var = sc.nextInt();
            if(flag < var){
                flag = var;
                answer++;
            }

        }
        System.out.println(answer);
    }
}
