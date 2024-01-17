package pkg03_ArrayList;

import java.util.*;

public class MainClass {

/*
    ArrayList
    1.배열 리스트를 구현한 클래스
    2. 실무에서는 배열대신 사용한다
    3. 배열의 특징을 그대로 가지고 있다
        1) 순서대로 데이터가 저장된다.
        2) 인덱스 가지고 있다
    *장점*
   - 크기 제한이 없음 (혹시 지정된 데이터보다 더 많이 추가해도 스스로 늘림)
   - 초기 사이즈 정할 필요도 없음
   - 삭제하기 편함 method 써서 삭제하면 앞으로 하나씩 당겨서 알아서 저장함

*/

    public static void method1() {

    //Arraylist 선언 Declaration (사용가능타입 : Collection<E>, List<E>, ArrayList<E>)
    List<Integer> numbers; // int[] numbers;

    //Create ArrayList
    numbers = new ArrayList<Integer>();

    //요소 추가하기
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    numbers.add(0);

    //요소 가져오기
    for (int number: numbers
         ) {
        System.out.println(number);
    }
    System.out.println(numbers.get(0));

    }

    public static void method2(){
        List<String> hobbies = new ArrayList<>();

        hobbies.add("게임");
        hobbies.add("여행");
        hobbies.add("목공예");
        hobbies.add("노래");
        hobbies.add("코딩");

        System.out.println(hobbies.size());

        for (int i = 0; i < hobbies.size(); i++) {

            System.out.println(hobbies.get(i));
        }
    }

    public static void method3(){
        Integer[] arr = new Integer[]{10,20,30};

        //array to Array list
        List<Integer> numbers = Arrays.asList(arr);

        // *WARNING*
        //numbers can NOT change the size
        System.out.println(numbers); //toString 생략


    }

    public static void method4(){
        List<String> seasons = new ArrayList<>();

        seasons.add("봄");
        seasons.add("여름");
        seasons.add("봄");
        seasons.add("피자");
        seasons.add("겨울");

        //MODIFY

        seasons.set(3,"가을");


        //DELETE
        System.out.println(seasons.remove(2));
        System.out.println("AFTER FIXED ---------");

        for (String season: seasons
             ) {
            System.out.println(season);

        }

    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}
