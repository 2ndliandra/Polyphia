package sepatu;

// Superclass Sepatu
class Sepatu {
    private String brand;
    private String tempatProduksi;
    private String jenis;
    private String nama;
    private String warna;

    public Sepatu(String brand, String tempatProduksi, String jenis, String nama, String warna) {
        this.brand = brand;
        this.tempatProduksi = tempatProduksi;
        this.jenis = jenis;
        this.nama = nama;
        this.warna = warna;
    }
    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setTempatProduksi(String tempatProduksi) {
        this.tempatProduksi = tempatProduksi;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    // Getter
    public String getBrand() {
        return brand;
    }
    public String getTempatProduksi() {
        return tempatProduksi;
    }
    public String getJenis() {
        return jenis;
    }
    public String getNama() {
        return nama;
    }
    public String getWarna() {
        return warna;
    }
    public void informasi() {
        System.out.println("Brand: " + brand);
        System.out.println("Buatan: " + tempatProduksi);
        System.out.println("Jenis: " + jenis);
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
    }
}

// Subclass SepatuLari
class SepatuLari extends Sepatu {
    private double berat; // berat dalam gram
    private boolean antiAir;

    public SepatuLari(String brand, String tempatProduksi, String jenis, String nama, String warna, double berat, boolean antiAir) {
        super(brand, tempatProduksi, jenis, nama, warna);
        this.berat = berat;
        this.antiAir = antiAir;
    }
        // Setter
        public void setBerat(double berat) {
            this.berat = berat;
        }
        public void setWaterproof(boolean antiAir) {
            this.antiAir = antiAir;
        }
        // Getter
        public double getBerat() {
            return berat;
        }
        public boolean isAntiAir() {
            return antiAir;
        }
        @Override
    public void informasi() {
        super.informasi();
        System.out.println("Berat sepatu: " + berat + " gram");
        System.out.println("Anti air? " + (antiAir ? "Ya" : "Tidak"));
    }
}

class SepatuFutsal extends Sepatu {
     private String jenisSol;
     private String fitur;
     
     public SepatuFutsal (String brand, String tempatProduksi, String jenis, String nama, String warna, String jenisSol, String fitur){
     super(brand, tempatProduksi, jenis, nama, warna);
     }
     public void setJenisSol(String jenisSol){
     this.jenisSol = jenisSol;
     }
     public void setFitur(String fitur){
     this.fitur = fitur;
     }
     public String getJenisSol(){
     return jenisSol;
     }
     public String getFitur(){
     return fitur;
     }
     public void informasi(){
     super.informasi();
         System.out.println("Jenis Sol: " + jenisSol);
         System.out.println("Fitur Sepatu: " + fitur);
     }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SepatuLari sepatuLari = new SepatuLari("Nike", "Indonesia", "Lari", "Zoom Fly", "Hitam", 225.5, true);
        System.out.println("===== INFORMASI SEPATU LARI =====");
        sepatuLari.informasi();
        
        SepatuFutsal sepatuFutsal = new SepatuFutsal("Adidas", "Vietnam", "Futsal", "Predator", "Merah", "IC (Indoor Court)", "Grip kuat, ringan");
        sepatuFutsal.setJenisSol("IC (Indoor Court)"); // Mengatur jenis sol sepatu
        sepatuFutsal.setFitur("Grip kuat, ringan"); // Mengatur fitur tambahan
        System.out.println("===== INFORMASI SEPATU FUTSAL =====");
        sepatuFutsal.informasi();
    }
}
