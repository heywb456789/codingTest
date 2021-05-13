package inflearn.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Q1 {
    public static void main(String[] args){
        Array_Q1 q = new Array_Q1();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int flag = 0;
        String answer = "";
        for(int i=0; i<size ; i++){
            int var = sc.nextInt();
            if(flag < var){
                answer+= var + " ";
            }
            flag = var ;
        }
        System.out.println();
//        System.out.println(q.solution());
    }

}
