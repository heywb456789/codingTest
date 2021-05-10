package inflearn.string;

import java.util.Scanner;

public class String_Q5 {
    public static void main(String[] args){
        //65 90 , 97 122;
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] c = new char[str.length()];
        String result = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch>= 65 && ch <=90) || (ch>=97 && ch<=122)){
                c[(str.length()-1)-i] = ch;
            }else{
                c[i] = ch;
            }
        }
        for(char a : c){
            result += a;
        }
        System.out.println(result);

    }
}
