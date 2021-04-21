package programmers.hash;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hash_Q4 {

    public static void main(String[] args){
        String [] genres = {"classic", "pop", "classic", "classic","jazz","pop", "Rock", "jazz"};
        int [] plays = {500, 600, 150, 800, 1100, 2500, 100, 1000};
        solution(genres, plays);

        Hash_Q4 main = new Hash_Q4();
        main.solution2(genres, plays);
        System.out.println(Arrays.toString(main.solution2(genres, plays)));
    }

    private static void solution(String[] genres, int[] plays){
        Map<String,Integer> map = new HashMap<String, Integer>();

        for(int i =0 ; i < genres.length ; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }

        List<Map.Entry<String,Integer>> entries = map.entrySet().stream()
//                                                .sorted(Map.Entry.comparingByValue())  //오름차순
                                                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))    //내림차순
                                                .collect(Collectors.toList());


        List<Integer> answerArray = new ArrayList<Integer>();
        for(Map.Entry<String,Integer> key : entries){
            List<Integer> result= new ArrayList<Integer>();
            for(int j=0; j < genres.length ; j++){
                if(genres[j].equals(key.getKey())){
                    result.add(plays[j]);
                }
            }
            result = result.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
            int var = 0;
            for(int k=0; k < result.size() ; k ++){
                for(int q=0; q<plays.length ; q++){
                    if(result.get(k) == plays[q]){
                        if(var >= 2) {
                            break;
                        }
                        answerArray.add(q);
                        var ++;

                    }
                }
            }
        }

        System.out.println(answerArray);


//        int[] answer = new int[answerArray.size()];
//        Object[] answerArrObj = answerArray.toArray();
//        for (int i = 0; i < answerArrObj.length; i++) {
//            answer[i] = (int) answerArrObj[i];
//        }

    }


    public class Music implements Comparable<Music>{

    private int played;
    private int id;
    private String genre;

    public Music(String genre, int played, int id) {
      this.genre = genre;
      this.played = played;
      this.id = id;
    }

    @Override
    public int compareTo(Music other) {
      if(this.played == other.played) return this.id - other.id;
      return other.played - this.played;
    }

    public String getGenre() {return genre;}
  }

  public int[] solution2(String[] genres, int[] plays) {
    return IntStream.range(0, genres.length)
    .mapToObj(i -> new Music(genres[i], plays[i], i))
    .collect(Collectors.groupingBy(Music::getGenre))
    .entrySet().stream()
    .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
    .flatMap(x->x.getValue().stream().sorted().limit(2))
    .mapToInt(x->x.id).toArray();
  }

  private int sum(List<Music> value) {
    int answer = 0;
    for (Music music : value) {
      answer+=music.played;
    }
    return answer;
  }




    /*
    private static int[] solution2(String[] genres, int[] plays) {
        //장르의 순위 결정을 위한 Hash 생성
        HashMap<String, Integer> rankHash = new HashMap<String, Integer>();
        for (int i = 0; i < plays.length; i++) {
            rankHash.put(genres[i], rankHash.getOrDefault(genres[i], 0) + plays[i]);
        }

        //장르 순위 판별을 위한 우선순위 큐 생성 (java에서 int형 우선순위 큐는 작은 것 부터 나오므로 lamda식을 이용해 역순으로 변환)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> y - x);
        for (Integer value : rankHash.values()) {
            pq.add(value);
        }

        //모든 장르는 재생된 횟수가 다르므로 rankHash의 Key, Value를 바꾼 HashMap 생성
        HashMap<Integer, String> rankHashReverse = new HashMap<Integer, String>();
        for (String key : rankHash.keySet()) {
            rankHashReverse.put(rankHash.get(key), key);
        }

        //장르의 재생 횟수를 이용하여 가장 높은 장르부터 rankArr에 순서대로 저장(장르의 순위 선정 완료)
        int uniqueGenreLength = pq.size();
        String[] rankArr = new String[uniqueGenreLength];
        for (int i = 0; i < uniqueGenreLength; i++) {
            rankArr[i] = rankHashReverse.get(pq.poll());
        }


        //장르의 순위는 정해졌으니 각 노래의 1,2위를 뽑기 위한 HashMap 생성
        HashMap<String, PriorityQueue<Song>> songsRank = new HashMap<String, PriorityQueue<Song>>();
        for (int i = 0; i < plays.length; i++) {
            if (songsRank.containsKey(genres[i])) {
                songsRank.get(genres[i]).add(new Song(i, plays[i]));
            } else {
                songsRank.put(genres[i], new PriorityQueue<Song>());
                songsRank.get(genres[i]).add(new Song(i, plays[i]));
            }
        }

        //정답리스트를 만들고 rankArr에 저장한 장르 순서대로 우선순위 큐에서 우선 순위가 높은 Song 하나씩 뽑아서 idx 저장
        ArrayList<Integer> answerArrList = new ArrayList<Integer>();
        for (int i = 0; i < rankArr.length; i++) {
            answerArrList.add(songsRank.get(rankArr[i]).poll().idx);
            //해당 장르에 한 곡이 전부라면 if 문 통과
            if (songsRank.get(rankArr[i]).peek() != null) {
                answerArrList.add(songsRank.get(rankArr[i]).poll().idx);
            }
        }

        //정답 리스트를 Array 형태로 변환 .toArray()는 Object[] 형태로 나오므로 int[] 형태로 바꾸어줌
        int[] answerArr = new int[answerArrList.size()];
        Object[] answerArrObj = answerArrList.toArray();
        for (int i = 0; i < answerArrObj.length; i++) {
            answerArr[i] = (int) answerArrObj[i];
        }

        return answerArr;
    }
     */
}
