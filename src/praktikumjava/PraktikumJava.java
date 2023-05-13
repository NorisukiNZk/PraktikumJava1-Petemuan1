package praktikumjava;

import Model.Mahasiswa;
import Model.MahasiswaTransfer;
import Model.Hp;

public class PraktikumJava {
    public static void main (String [] args){
        Mahasiswa mahasiswa = new Mahasiswa ();

        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010589");
        mahasiswa.setNama("Muhammad Hasani Waffa");
        mahasiswa.setIPK(4);

        mahasiswa.viewData();


        Mahasiswa m1 = new Mahasiswa(
                2,
                "2110010589",
                "Muhammad Hasani Waffa",
                4);
        m1.viewData();


        Hp hpsaya = new Hp ();

        hpsaya.setId(1);
        hpsaya.setMerek("Samsung Z Fold");
        hpsaya.setRilis(2023);
        hpsaya.setHarga(20000);

        hpsaya.viewData();

        Hp hpdia = new Hp(
                2,
                "Nothing Phone",
                2024,
                80000
        );

        hpdia.viewData();



        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110010589");
        mt.setNama("Muhammad Hasani Waffa");
        mt.setIPK(4);
        mt.viewData();
    }
}
