package Komputer;

public class Main {
    public static void main(String[] args) {

        Laptop baru = new Laptop();

        //panggil method
        baru.laptop();
        baru.warnaLaptop();
        baru.merekLaptop();
        baru.hargaLaptop();
        baru.ukuranLaptop();

        System.out.println(baru.nama_pemilik ="Boy");
        System.out.println(baru.merek ="Asus ROG");
        System.out.println(baru.warna ="Merah");
        System.out.println(baru.harga =5000000);
        System.out.println(baru.ukuran_layar ="16 inc");


        //panggil construktor
        Laptop pertama = new Laptop("Udin", "Asus Rog", "14 inc");
        System.out.println(pertama.nama_pemilik);
        System.out.println(pertama.merek);
        System.out.println(pertama.ukuran_layar);

        Laptop kedua = new Laptop("Acer Aspire 3", "Biru");
        System.out.println(kedua.merek);
        System.out.println(kedua.warna);

        Laptop ketiga = new Laptop("Toshiba");
        System.out.println(ketiga.merek);


        //panggil overloading
        baru.tipeLaptop1("ASUS ROG");
        baru.tipeLaptop2("ACER ASPIRE 3 ","Biru");
        baru.tipeLaptop3("Halimatus ","Acer" ,"14 inc");

    }
}
