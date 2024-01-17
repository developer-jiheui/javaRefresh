package pkg04_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void method1(){

        //선언 declare HashSet type
        Set<String> hobbies;

        //객체 형성
        hobbies = new HashSet<>();

        //요소 추가하기 (순서없이 저장되고, 중복저장이 불가능하다)
        hobbies.add("스쿠버 다이빙");
        hobbies.add("스쿠버 다이빙");
        hobbies.add("스쿠버 다이빙");
        hobbies.add("여행");
        hobbies.add("노래");
        hobbies.add("코딩");
        hobbies.add("게임");
        hobbies.add("골프");

        for (String hobby: hobbies
             ) {
            System.out.println(hobby);
        }

    }

    public static void method2(){
        //교집합
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));

        //set 1이 교집합 결과로 변환되다
        set1.retainAll(set2);

        System.out.println(set1);

    }

    public static void method3(){
        //합집합
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));

        //set 1이 합집합 결과로 변환되다
        set1.addAll(set2);

        System.out.println(set1);

    }

    public static void method4(){
        //차집합
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));

        //set 1이 차집합 결과로 변환되다
        set1.removeAll(set2);

        System.out.println(set1);

    }






    public static void main(String[] args) {
        //method1();
        method2();
        method3();
        method4();
    }

}
