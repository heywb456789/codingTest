package inflearn.array;

import java.util.Scanner;

public class Array_Q3 {
    public static void main(String[] args){
        Array_Q3 q = new Array_Q3();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] a = new int[size];
        int [] b = new int[size];
        String [] result = new String[size];
        for(int i=0; i< size; i++){
            a[i] = sc.nextInt();
        }
        for(int j=0; j< size; j++){
            b[j] = sc.nextInt();
        }

        for(int k = 0; k < a.length ;k++){
            switch (a[k]){
                case 1:
                    if(b[k] == 1){
                        result[k] = "D";
                    }else if(b[k] ==2){
                        result[k] = "B";
                    }else{
                        result[k] = "A";
                    }
                    break;
                case 2:
                    if(b[k] == 1){
                        result[k] = "A";
                    }else if(b[k] ==2){
                        result[k] = "D";
                    }else{
                        result[k] = "B";
                    }
                    break;
                case 3:
                    if(b[k] == 1){
                        result[k] = "B";
                    }else if(b[k] ==2){
                        result[k] = "A";
                    }else{
                        result[k] = "D";
                    }
                    break;
                default:
                    break;
            }
            System.out.println(result[k]);
        }

    }
}
