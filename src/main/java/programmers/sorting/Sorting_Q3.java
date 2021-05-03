package programmers.sorting;

import java.util.Arrays;

public class Sorting_Q3 {
    public static void main (String[] args){
//        int[] citations ={4, 0, 6, 1, 5};
        int[] citations ={7,8,9,9};
        solution(citations);
    }

    private static int solution(int[] citations) {

        Arrays.sort(citations);
		int answer = citations.length;

		for (int i = citations.length - 1; i >= 0; i--) {

			int remain = citations.length - i;
			if (citations[i] <= remain) {

				// 남은 갯수와 값이 같다면 해당 값을 리턴
				// 남은 갯수보다 값이 작다면 해당 값을 제외하고 남은 갯수를 리턴
				answer = citations[i] == remain ? citations[i] : remain - 1;
				break;
			}
		}
		return answer;
    }
}
