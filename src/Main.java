import models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        Kubus kubus = new Kubus();
        Prisma prisma = new Prisma();
        Bola bola = new Bola();

        int pil;
        char input;
        do{
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Kubus");
            System.out.println("5. Prisma");
            System.out.println("6. Bola");
            System.out.println("7. Exit");
            System.out.print("Pilihan : ");
            pil = sc.nextInt();
            switch(pil){
                case 1 :
                    persegi.Bangun();
                    persegi.Karakteristik();
                    System.out.println("Sisi Persegi = ");
                    persegi.setSisi(sc.nextInt());
                    System.out.println("Luas Persegi = " + persegi.Luas());
                    System.out.println("Keliling Persegi = " + persegi.Keliling());
                break;
                case 2 :
                    segitiga.Bangun();
                    segitiga.Karakteristik();
                    System.out.println("Alas Segitiga = ");
                    segitiga.setAlas(sc.nextInt());
                    System.out.println("Tinggi Segitiga = ");
                    segitiga.setTinggi(sc.nextInt());
                    System.out.println("Luas Segitiga = " + segitiga.Luas());
                    System.out.println("Keliling Segitiga = " + segitiga.Keliling());
                break;
                case 3 :
                    lingkaran.Bangun();
                    lingkaran.Karakteristik();
                    System.out.println("Jari-Jari Lingkaran = ");
                    lingkaran.setJari(sc.nextInt());
                    System.out.println("Luas Lingkaran = " + lingkaran.Luas());
                    System.out.println("Keliling Lingkaran = " + lingkaran.Keliling());
                    break;
                case 4 :
                    kubus.Bangun();
                    kubus.Karakteristik();
                    System.out.println("Sisi Kubus = ");
                    kubus.setSisi(sc.nextInt());
                    System.out.println("volume Kubus = " + kubus.volume());
                    System.out.println("Luas Permukaan Kubus = " + kubus.luasP());
                    break;
                case 5 :
                    prisma.Bangun();
                    prisma.Karakteristik();
                    System.out.println("Alas Prisma = ");
                    prisma.setAlas(sc.nextInt());
                    System.out.println("Tinggi Alas Prisma = ");
                    prisma.setTinggi(sc.nextInt());
                    System.out.println("Tinggi Prisma = ");
                    prisma.setTinggiP(sc.nextInt());
                    System.out.println("volume Prisma = " + prisma.volume());
                    System.out.println("Luas Permukaan Prisma = " + prisma.luasP());
                    break;
                case 6 :
                    bola.Bangun();
                    bola.Karakteristik();
                    System.out.println("Jari-Jari Bola = ");
                    bola.setJari(sc.nextInt());
                    System.out.println("volume Bola = " + bola.volume());
                    System.out.println("Luas Permukaan Bola = " + bola.luasP());
                    break;
                case 7 : System.exit(0);
            }
            System.out.println("Coba Ulang?");
            input=sc.next().charAt(0);
        } while (input == 'y');
    }
}