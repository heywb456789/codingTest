package programmers.exhausitive;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Exhausitive_Q2 {

    private static int cnt = 0;
    private static TreeSet<String> set = new TreeSet<>();

    public static void main(String[] args){
        String numbers = "011";
        
        solution(numbers);
        
    }

    private static int solution(String numbers) {
        int size = numbers.length();

        List<Character> arr = new ArrayList<>();
        for(int i=0; i< size ; i++){
            arr.add(numbers.charAt(i));
        }

        //결과 저장 리스트
        List<Character> result = new ArrayList<>();

        //npr에서 r을 늘리면서 순열 알고리즘 실행
        for(int i = 0; i < size ; i++){
            permutation(arr, result , size, i+1);
        }
        return cnt;
    }

    private static void permutation(List<Character> arr, List<Character> result, int n, int r) {
        if (r == 0) {

			// 0으로 시작하는 부분집합은 제외
			if (result.get(0) != '0') {

				String str = "";
				int size = result.size();
				for (int i = 0; i < size; i++) {
					str += result.get(i);
				}

				int num = 0;

				// 이미 나온 숫자 조합이 아닐 경우
				if (!set.contains(str)) {
					num = Integer.parseInt(str);
					set.add(str);

					// 소수 판별
					if (isPrime(num)) {
						System.out.println(num);
						cnt++;
					}
				}
			}

			return;
		}

		for (int i = 0; i < n; i++) {

			result.add(arr.remove(i));
			permutation(arr, result, n - 1, r - 1);
			arr.add(i, result.remove(result.size() - 1));
		}

    }

    private static boolean isPrime(int n) {

		int i;
		int sqrt = (int) Math.sqrt(n);

		// 2는 유일한 짝수 소수
		if (n == 2)
			return true;

		// 짝수와 1은 소수가 아님
		if (n % 2 == 0 || n == 1)
			return false;

		// 제곱근까지만 홀수로 나눠보면 됨
		for (i = 3; i <= sqrt; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

}
