package Buku;

public class TextBook extends Book {
    public String Subject;

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public TextBook() {
        super();
        Subject = "";

    }

    public TextBook(String title, String Subject, int year, double price) {
        super(title, price, year);
        this.Subject = Subject;
    }

    public void print() {
        super.print();
        System.out.println("Subject: " + Subject);
    }
}
