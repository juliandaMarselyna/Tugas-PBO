/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosemester2;

// Interface BangunDatar
interface BangunDatar {
    double luas();
    double keliling();
}

// Kelas Persegi
class Persegi implements BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran
class Lingkaran implements BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * r;
    }
}

// Kelas Segitiga
class Segitiga implements BangunDatar {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi)); // Diasumsikan segitiga siku-siku
        return alas + tinggi + sisiMiring;
    }
}

// Kelas Main untuk menjalankan program
public class soal1{
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(10);
        BangunDatar segitiga = new Segitiga(6, 8);

        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}
