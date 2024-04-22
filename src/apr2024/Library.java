package apr2024;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // 책 추가 메서드
    public void addBook(Book book) {
        books.add(book);
    }

    // 도서관에 있는 모든 책의 정보 출력 메서드
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));

        library.printBooks();
    }
}
