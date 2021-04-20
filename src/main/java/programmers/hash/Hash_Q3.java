package programmers.hash;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Hash_Q3 {

    public static void main(String[] args){
//        String[][]clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][]clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        Hash_Q3 main = new Hash_Q3();
        main.solution(clothes);

        System.out.println(solution2(clothes));
    }

    private void solution(String[][] clothes){
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String[] a : clothes){
            map.put(a[1],map.getOrDefault(a[1], 0) +1);
        }

        int result = 1;
        for(int values : map.values()){
            result *= (values +1);
        }
        result -= 1;

    }

    private static int solution2(String[][] clothes){
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }

}
