package pkg02_generic_type;

public class MainClass {
    public static void main(String[] args) {
        //Integer
        Container<Integer> test_int = new Container<Integer>();
        test_int.setItem(10);
        System.out.println(test_int.getItem());

        Container<String> test_string = new Container<>();
        test_string.setItem("WOW");
        System.out.println(test_string.getItem());




    }
}
