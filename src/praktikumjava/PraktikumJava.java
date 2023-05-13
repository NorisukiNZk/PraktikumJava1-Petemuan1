package praktikumjava;

import Model.Mahasiswa;
import Model.MahasiswaTransfer;

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



        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110010589");
        mt.setNama("Muhammad Hasani Waffa");
        mt.setIPK(4);
        mt.viewData();
    }
}
