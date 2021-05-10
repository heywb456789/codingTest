package inflearn.string;

import java.util.Scanner;

public class String_Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] arr = new String[size];

        for(int i=0; i<size ; i++){
            String org = sc.next();
            String rev = "";
            for(int j = org.length()-1 ; j >=0 ; j--){
                rev += org.charAt(j);
            }
            arr[i] = rev;
        }

        for(String s : arr){
            System.out.println(s);
        }
    }
}
