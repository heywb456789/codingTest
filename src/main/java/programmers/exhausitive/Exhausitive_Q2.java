package programmers.exhausitive;

public class Exhausitive_Q2 {
    public static void main(String[] args){
        String numbers = "17";
        
        solution(numbers);
        
    }

    private static int solution(String numbers) {
        int answer = 0;

        String[] split = new String[numbers.length()];

        for(int i=0; i<numbers.length(); i++){
//            int var = Integer.parseInt(numbers.substring(i, i+1));

//            if(var >0) {
                split[i] = numbers.substring(i, i + 1);
//            }
        }


        for(int j = 0; j < split.length ; j++){
            for(int k=0; k< split.length ; k++){
                int var = Integer.parseInt(split[j]);
                if(var == 0) break;

                int com = Integer.parseInt(split[j] + split[k]);

                //TODO : 소수 구하기



            }
        }
        System.out.println(answer);
        return answer;
    }

}
