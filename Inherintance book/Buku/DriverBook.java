package Buku;

import java.util.Scanner;

public class DriverBook {
    public static void main(String[] args) {
        Scanner Abigtg = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║         Selamat Datang di Sistem         ║");
        System.out.println("║                   BOOK                   ║");
        System.out.println("╚══════════════════════════════════════════╝\n");
        
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  Login Sekolah (Masukkan Angka Saja)     ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║  1. Novel                                ║");
        System.out.println("║  2. Biography                            ║");
        System.out.println("║  3. TextBook                             ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.print("Pilihan Anda: ");
        int pilihan = Abigtg.nextInt();
    
    if (pilihan == 1) {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║           ! ANDA MEMILIH NOVEL !           ║");
        System.out.println("║           Masukkan Data Novel Anda         ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        System.out.print("Nama Novel: ");
        String title = Abigtg.next();
        Abigtg.nextLine();  
        System.out.print("Genre Novel:");
        String Genre = Abigtg.nextLine();
        System.out.print("Tahun terbit: ");
        int year = Abigtg.nextInt();
        System.out.print("Harga: ");
        double price = Abigtg.nextInt();

        if (year < 2011) {
            price = price-(price*0.5);
        } else if (year >= 2011 && year < 2020) {
            price = price-(price*0.2);
        }       

        System.out.println("------------------------------");
        System.out.println("DATA NOVEL BERHASIL DIMASUKKAN");
        System.out.println("------------------------------");
        Novel novel=new Novel(title,Genre,year,price);
        novel.print();
        
} else if (pilihan == 2) {
    System.out.println("\n╔════════════════════════════════════════════╗");
    System.out.println("║         ! ANDA MEMILIH BIOGRAPHY !         ║");
    System.out.println("║        Masukkan Data Biography Anda        ║");
    System.out.println("╚════════════════════════════════════════════╝");

    System.out.print("Nama Subject: ");
        String Subject = Abigtg.next();
        Abigtg.nextLine();  
        System.out.print("Nama Biography:");
        String title = Abigtg.nextLine();
        System.out.println("About?:");
        String about = Abigtg.nextLine();
        System.out.print("Tahun terbit: ");
        int year = Abigtg.nextInt();
        System.out.print("Harga: ");
        double price = Abigtg.nextInt();

        if (year < 2011) {
            price = price-(price*0.5);
        } else if (year >= 2011 && year < 2020) {
            price = price-(price*0.2);
        }

        System.out.println("----------------------------------");
        System.out.println("DATA BIOGRAPHY BERHASIL DIMASUKKAN");
        System.out.println("----------------------------------");
        Biography biography=new Biography(Subject,title,about,price,year);
        biography.print();
}else if (pilihan == 3) {
    System.out.println("\n╔════════════════════════════════════════════╗");
    System.out.println("║          ! ANDA MEMILIH TEXTBOOK !         ║");
    System.out.println("║         Masukkan Data Biography Anda       ║");
    System.out.println("╚════════════════════════════════════════════╝");

    System.out.print("Nama TextBook: ");
        String title = Abigtg.next();
        Abigtg.nextLine();  
        System.out.print("Nama Subject:");
        String Subject = Abigtg.nextLine();
        System.out.println("Tahun Terbit:");
        int year = Abigtg.nextInt();
        System.out.println("Harga: ");
        double price = Abigtg.nextInt();
        if (year < 2011) {
            price = price-(price*0.5);
        } else if (year >= 2011 && year < 2020) {
            price = price-(price*0.2);
        }
        System.out.println("-----------------------------------");
        System.out.println(" DATA TEXTBOOK BERHASIL DIMASUKKAN ");
        System.out.println("-----------------------------------");
        TextBook textbook =new TextBook(title,Subject,year,price);
        textbook.print();
        
} Abigtg.close(); 
}
}
