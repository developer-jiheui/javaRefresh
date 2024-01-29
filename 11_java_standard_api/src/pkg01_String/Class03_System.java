package pkg01_String;

import java.text.SimpleDateFormat;

public class Class03_System {
    public static void main(String[] args) {

        //1. 현재 timestamp 가져오기
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);

        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.SSS");
        System.out.println(sdf.format(timestamp));
        long start = System.nanoTime();
        System.out.println("Hello World");
        long end = System.nanoTime();
        System.out.println(end- start + "ns");
    }

    public static void practice01(){

        //String을 이용


    }
}
