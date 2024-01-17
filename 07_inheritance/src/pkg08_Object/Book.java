package pkg08_Object;
/*
* Object 클래스 (전부 저장가능, 만능 타입)
* 1. 모든 클래스들의 최상위 부모 클래스이다.
* 2. extends 키워드를 명시하지 않은 클래스들은 모두 Object 클래스를 상속한다.
* 3. 주요 메소드
*   1) boolean equals(Object another){ }
*   2) String toString(){ }
* 4. 역할
*   1) 모든 것(값, 객체)를 저장할수 있는 만능타입이다.
*       -> Object 타입으로 저장한 객체는 해당 객체 타입으로 *캐스팅*(유일한 해결책)해야 메소드를 호출할 수 있다.
*   2) 모든 클래스들의 공통기능을 지원한다.
*       -> Object 클래스의 메소드를 override해서 원하는 기능으로 바꿀 수 있다.
*   3)
*
* */


import java.util.Objects;

public class Book {

    private String isbn;
    private String title;

    public Book(){}

    public Book(String isbn, String title) {
        super();
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
