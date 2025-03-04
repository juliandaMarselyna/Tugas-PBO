/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosemester2;

// Kelas induk (superclass)
abstract class BodyCare {
    abstract void manfaat();
    abstract void caraPakai();
    abstract void bahanUtama();
}

// Kelas Sabun
class Sabun extends BodyCare {
    @Override
    void manfaat() {
        System.out.println("Sabun: Membersihkan tubuh dari kotoran dan bakteri.");
    }
    @Override
    void caraPakai() {
        System.out.println("Cara pakai Sabun: Basahi tubuh, gosokkan sabun ke kulit, lalu bilas.");
    }
    @Override
    void bahanUtama() {
        System.out.println("Bahan utama Sabun: Aloe Vera dan Tea Tree Oil.");
        System.out.println();
    }
}

// Kelas Lotion
class Lotion extends BodyCare {
    @Override
    void manfaat() {
        System.out.println("Lotion: Melembapkan dan menjaga kelembutan kulit.");
    }
    @Override
    void caraPakai() {
        System.out.println("Cara pakai Lotion: Oleskan merata pada kulit setelah mandi.");
    }
    @Override
    void bahanUtama() {
        System.out.println("Bahan utama Lotion: Shea Butter dan Vitamin E.");
        System.out.println();
    }
}

// Kelas Body Scrub
class BodyScrub extends BodyCare {
    @Override
    void manfaat() {
        System.out.println("Body Scrub: Mengangkat sel kulit mati dan membuat kulit lebih halus.");
    }
    @Override
    void caraPakai() {
        System.out.println("Cara pakai Body Scrub: Gosokkan scrub ke tubuh dengan gerakan melingkar, lalu bilas.");
    }
    @Override
    void bahanUtama() {
        System.out.println("Bahan utama Body Scrub: Gula dan Madu.");
        System.out.println();
    }
}

// Kelas utama (Main)
public class Body_Care {
    public static void main(String[] args) {
        BodyCare sabun = new Sabun();
        BodyCare lotion = new Lotion();
        BodyCare scrub = new BodyScrub();

        sabun.manfaat();
        sabun.caraPakai();
        sabun.bahanUtama();

        lotion.manfaat();
        lotion.caraPakai();
        lotion.bahanUtama();

        scrub.manfaat();
        scrub.caraPakai();
        scrub.bahanUtama();
    }
}
