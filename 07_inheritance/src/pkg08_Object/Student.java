package pkg08_Object;

public class Student {

    private int stuNo;
    private String name;
    private Book[] books;
    private int bookCount;

    public Student() {
        this.books = new Book[100];
    }

    public Student(int stuNo, String name) {
        super();
        this.stuNo = stuNo;
        this.name = name;
        this.books = new Book[100];
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    //책 등록
    public void addBook(Book book){

        if(bookCount >= books.length){
            System.out.println("더 이상 책을 등록할 수 없다");
            return;
        }

        books[bookCount++]= book;

    }

    //책 삭제
    public void removeBook(int index){

        if(index<0 || index >= bookCount){
            System.out.println("잘못된 인덱스 입니다");
            return;
        }
        System.arraycopy(books, index+1 ,this.books, index, bookCount-index -1);
        bookCount--;
        books[bookCount] = null;

    }

    //책 삭제 오버로딩
    public void removeBook(Book book){

        if(bookCount==0){
            System.out.println("there is no book already");
            return;
        }
        else{
            for (int i = 0; i < bookCount; i++) {
              if(book.equals(books[i])){ //equals should be overridden
                System.arraycopy(books, i+1 ,this.books, i, bookCount-i -1);
                bookCount--;
                books[bookCount] = null;
                break;
              }
            }
        }

    }



        /*
            Object 클래스의 equals() method override
            compare stuNo field => return true;

        */

    @Override
    public boolean equals(Object obj){
        if(obj==null){return false;}
        if(obj == this){return true;}
//            return super.equals(obj);
        return this.stuNo ==((Student)obj).stuNo;
    }


    /*
    toSring Override
    retrun stuNo : 10101, name : me
    */

    @Override
    public String toString(){
        return "Student number : "+ this.stuNo + "\nstudent name : " + this.name ;
    }

}
