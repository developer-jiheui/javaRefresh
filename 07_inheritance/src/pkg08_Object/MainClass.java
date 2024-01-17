package pkg08_Object;

public class MainClass {

    public static void main(String[] args) {
        //object type book object
    Object obj = new Book("979-11-6224-187-5","Java to study alone");

    //Cast Object type to Book
    System.out.println(((Book) obj).getTitle());
    System.out.println(((Book) obj).getIsbn());

    Book book = new Book("979-11-6224-187-5","Java to study alone");

        System.out.println(obj.equals(book));
        System.out.println(book.toString());
        System.out.println(book); //toString 생략가능



        /***********************************************/

        Student stu1 = new Student(10101, "me");
        Student stu2 = new Student(10101, "me");

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.toString());

        stu1.addBook(new Book("979-11-6224-187-5","Java to study alone"));
        stu1.addBook(new Book("979-11-6224-187-6","Java to study alone 1"));
        stu1.addBook(new Book("979-11-6224-187-7","Java to study alone2"));
        stu1.addBook(new Book("979-11-6224-187-8","Java to study alone3"));
        stu1.addBook(new Book("979-11-6224-187-9","Java to study alone4"));
        stu1.addBook(new Book("979-11-6224-187-10","Java to study alone5"));
        stu1.addBook(new Book("979-11-6224-187-11","Java to study alone6"));



        for (Book b: stu1.getBooks()) {
            if(b!=null){
            System.out.println(b);
            }
        }

        stu1.removeBook(new Book("979-11-6224-187-5","Java to study alone"));


        for (Book b: stu1.getBooks()) {
            if(b!=null){
            System.out.println(b);
            }
        }

    }

}
