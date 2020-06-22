package Komputer;

public class Laptop {

        //atribut
        String merek;
        String warna;
        String ukuran_layar;
        String nama_pemilik;
        int harga = 4500000;

        //construktor
        public Laptop(String nama_pemilik, String merek, String ukuran_layar) {
            this.nama_pemilik = nama_pemilik;
            this.merek = merek;
            this.ukuran_layar = ukuran_layar;
        }

        public Laptop(String merek, String warna) {
            this.merek = merek;
            this.warna = warna;
        }

        public Laptop(String toshiba) {
            this.merek = merek;
            this.harga = harga;

        }

        public Laptop() {

        }

        // method
        public void set(String nama_pemilik, String merek, String warna, String ukuran_layar, double harga) {
            this.nama_pemilik = nama_pemilik;
            this.merek = merek;
            this.warna = warna;
            this.ukuran_layar = ukuran_layar;
            this.harga = (int) harga;
        }
        void laptop(){
            System.out.println("Berbagai macam Laptop yang cocok untuk bermain game");
            System.out.println("Warna Laptop : "+warna);
        }
        void warnaLaptop(){
            System.out.print("Pilih warna Laptop : ");
            System.out.println("Black, White and Red");
        }
        void merekLaptop(){
            System.out.print("Pilih merek laptop yang akan anda beli : ");
            System.out.println("Asus, Acer, Toshiba");
        }
        int hargaLaptop(){
            System.out.print("Pilih merek laptop yang akan anda beli : ");
            return harga;
        }
        void ukuranLaptop(){
            System.out.print("Pilih ukuran laptop yang akan anda beli : ");
            System.out.println("12 inc, 14 inc");
        }


        //method overloading
        void tipeLaptop1(String merek){
            System.out.println(merek);
        }
        void tipeLaptop2(String merek, String warna){
            System.out.println(merek + warna);
        }
        void tipeLaptop3(String nama_pemilik,String merek, String ukuran_layar){
            System.out.println(nama_pemilik + merek  + ukuran_layar);
        }


}
