import java.util.Arrays;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
    @Override
    public String toString() {
        return "Książka: "+ title+", autora: "+author;
    }
    public static <T extends Comparable<T>> T sortAndReturnFirst(T[] t){
        if(t.length==0) return null;
        Arrays.sort(t);
        return t[0];
    }

    public static void main(String[] args) {
        Book[] books = new Book[3];
        Book book=new Book("Woda","Adam Małecki");
        Book book1=new Book("Myszy","Anna Kot");
        Book book2=new Book("Mikhail","Mikhail Kot");
        books[0]=book;
        books[1]=book1;
        books[2]=book2;
        System.out.println(sortAndReturnFirst(books));
    }
}
