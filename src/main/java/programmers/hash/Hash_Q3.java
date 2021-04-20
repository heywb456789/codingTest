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

    /**
     * (A종류 옷 가지수 + 1)*(B종류 옷 가지수 + 1)*(C종류 옷 가지수 + 1) - 1
     *
     * 수학 순열과 조합 단원의 문제와 유사한데요. 단순하게 생각해서 상의가 1개, 썬글라스 1개가 있다면 경우의 수는
     * (상의+썬글라스),(상의),(썬글라스) 입니다. 이러한 조합을 만드는 과정을 생각해보면 상의를 입을때 혹은 안 입을때로 나눌 수 있으며 (상의 +1)
     * 그때마다 썬글라스를 쓸지 안쓸지로 나눌 수있습니다. (썬글라스+1)
     * 두 사건이 연속적으로 일어나므로 곱하기를 해줘야하며 상의도 썬글라스도 둘다 안쓰는 경우는 없기 때문에 모두 없는 것은 제외해줘야합니다. (-1)
     * 즉 (1(옷개수)+1(선택안할경우))x(1(썬글라스개수)+1(선택안할경우))-1(전체 선택안할경우) 이 되는것이죠!
     * 2x2-1
     * 갯수를 줄여서 단순하게 조합으로 생각해보면 조금 더 쉽게 다가올 것 같습니다!
     * @param clothes
     */
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
