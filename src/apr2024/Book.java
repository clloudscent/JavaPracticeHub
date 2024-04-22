package apr2024;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // 생성자
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // 게터 메서드
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // 책 정보를 문자열로 반환
    public String getInfo() {
        return title + " by " + author + ", published in " + publicationYear;
    }
}
