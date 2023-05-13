package Model;

public class Hp {
    private int id;
    private String merek;
    private int rilis;
    private double harga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getRilis() {
        return rilis;
    }

    public void setRilis(int rilis) {
        this.rilis = rilis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void viewData(){
        System.out.println("================ Pembayaran ================");
        System.out.println("ID   \t :  "+id);
        System.out.println("Nama Merek  \t :  "+merek);
        System.out.println("Tahun Rilis\t :  "+rilis);
        System.out.println("Harga \t :  "+harga);
        System.out.println("================ Pembayaran ================");
        System.out.println("");
    }
}
