package pkg05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

    /*
    * HashMap
    * 1. 객체(인스턴스)를 대신할 수 있는 자료구조이다.
    * 2. 구성
    *   1)key : 데이터 식별자, HashSet으로 구성되어있다. (순서없고 중복없다)
    *   2)Value : 데이터 자체
    *   3) Entry : Key 와 Value를 합쳐서 부르는 이름
    *
    *
    * */

    public static void method1(){

        //Mutable 객체

        //HashMap 선언
        Map<String, Object> book;

        //Create
        book = new HashMap<>();

        //Key, Value 추가 =(Entry 추가)

        book.put("title","어린왕자");
        book.put("author","생 떽쥐베리");
        book.put("isBestSeller",true);
        book.put("price",15000);

        System.out.println(book.get("title"));
        System.out.println(book.get("author"));
        System.out.println((boolean)book.get("isBestSeller") ? "베스트셀러" : "일반서적");
        System.out.println(book.get("isBestSeller").equals(true) ? "베스트셀러" : "일반서적");
        System.out.println(book.get("price"));
    }

    public static void method2(){

        //Immutable 객체 - can NOT change the value

        Map<String, Object> map = Map.of("name", "홍길동");

        System.out.println(map.get("name"));

        //값을 바꾸려는 시도
        //map.put("Age",10);

    }

    public static void method3(){

        //Key는 HashSet으로 되어있다

        Map<String, Object> map = Map.of("name", "홍길동"
                , "age", 24
                , "isMarried", false);

        Set<String> keys = map.keySet();

        for (String key: keys
             ) {

            System.out.println("Key : "+ key + " |  Value : " +map.get(key));

        }
    }

    public static void method4() {

        // Entry 전체를 Set 로 만들 수 있다.

        Map<String, Object> map = Map.of("name", "홍길동"
                                       , "age", 10
                                       , "isMarried", false);

        Set<Entry<String, Object>> entrySet = map.entrySet();
        for(Entry<String, Object> entry : entrySet) {
          System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static void method5(){

        Map<String,Object> map = new HashMap<>();

        map.put("name", "hong");
        map.put("age", 10);
        map.put("isMarried", false);

        // MODIFY using put() with same key
        map.put("age",20);

        System.out.println(map.get("age"));
        System.out.println(map);

        map.remove("isMarried");

        System.out.println(map);
    }

    public static void test(){
        Map<String,Object> id_dataTable = new HashMap<>();
        Map<String,Object> member_dataTable1 = new HashMap<>();
        Map<String,Object> member_dataTable2 = new HashMap<>();
        Map<String,Object> member_dataTable3 = new HashMap<>();

        List<HashMap> hashMapList = new ArrayList<>();

        id_dataTable.put("1","something@gmail.com");
        id_dataTable.put("2","two@gmail.com");
        id_dataTable.put("3","three@naver.com");

        hashMapList.add((HashMap) id_dataTable);

        member_dataTable1.put("id","something@gmail.com");
        member_dataTable1.put("password","password");
        member_dataTable1.put("name", "You");
        member_dataTable1.put("age",23);
        member_dataTable1.put("sex", "M");


        member_dataTable2.put("id","two@gmail.com");
        member_dataTable2.put("password","password02");
        member_dataTable2.put("name", "Me");
        member_dataTable2.put("age",31);
        member_dataTable2.put("sex", "F");


        member_dataTable3.put("id","three@naver.com");
        member_dataTable3.put("password","password_03");
        member_dataTable3.put("name", "Someone");
        member_dataTable3.put("age",48);
        member_dataTable3.put("sex", "M");

        hashMapList.add((HashMap) member_dataTable3);
        hashMapList.add((HashMap) member_dataTable2);
        hashMapList.add((HashMap) member_dataTable1);




        for (int i = 1; i < hashMapList.size(); i++) {

            Map mem_table = hashMapList.get(i);
            Set<String> mem_keys = mem_table.keySet();

            for (String key: mem_keys
                 ) {
                if(key.equals("id")){
                    for (int j = 0; j < hashMapList.get(0).size(); j++) {
                        if(hashMapList.get(0).get(Integer.toString(j+1)).equals(mem_table.get(key))){
                            System.out.println("MATCH FOUND");
                            System.out.println("Member number :" + (j+1));
                            System.out.println("Match by : " + key);
                            System.out.println(key + " : " + mem_table.get(key));
                        }
                    }
                }

            }
        }


//        for (int i = 0; i < hashMapList.size(); i++) {
//
//            Map hashMap = hashMapList.get(i);
//            Set<String> keys = hashMap.keySet();
//            System.out.println(hashMap);
//            for(String key : keys) {
//              System.out.println(key + ": " + hashMap.get(key));
//            }
//        }

    }


    public static void main(String[] args) {
        //method1();
        //method4();
        test();
    }
}
