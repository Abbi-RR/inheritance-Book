package Buku;

public class Biography extends TextBook {
    public String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Biography() {
        super();
        about = "";
    }

    public Biography(String Subject, String title, String about, double price, int year) {
        super(title, Subject, year, price);
        this.about = about;
    }

    public void print() {
        super.print();
        System.out.println("About: " + about);
    }
}
