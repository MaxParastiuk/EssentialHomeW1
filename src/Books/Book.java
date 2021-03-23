package Books;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        author.setAuthor("Стивен Кинг");
        content.setContent("Ужасы");
        title.setTitle("Кэрри");

        author.show();
        title.show();
        content.show();
    }
}
