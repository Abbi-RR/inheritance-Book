package Buku;

public class Novel extends Book {
    public String Genre;

    public String getGenre() {
        return this.Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    public Novel() {
        super();
        Genre = "";
    }
    public Novel( String title, String Genre, int year, double price) {
        super(title,price,year);
        this.Genre = Genre;
    }

    public void print() {
        super.print();
        System.out.println("Genre: " + Genre);
    }
}
