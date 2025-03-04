package bangundatar;

class BangunDatar {
     private double luas;
     private double keliling;
        //======//cosntructor//======//
        public BangunDatar(){
        this.luas = 0;
        this.keliling = 0;
        }
        public BangunDatar(double luas, double keliling){
        this.luas = luas;
        this.keliling = keliling;
        }
        //setter
        public void setLuas(double luas){
        this.luas = luas;
        }
        public void setKeliling(double keliling){
        this.keliling = keliling;
        }
        //getter
        public double getLuas(){
        return luas;
        }
        public double getKeliling(){
        return keliling;
        }
        public void informasi(){
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }

     class Segitiga extends BangunDatar{
         private double alas;
         private double tinggi;
         
            public Segitiga (double alas, double tinggi){
            super();
            this.alas = alas;
            this.tinggi = tinggi;
            hitungLuasKeliling();
            }
            //constructor
            public Segitiga (double luas, double keliling, double alas, double tinggi){
            super(luas, keliling);
            this.alas = alas;
            this.tinggi = tinggi;
            }

             public void hitungLuasKeliling() {
             double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
             double luas = 0.5 * alas * tinggi;
             double keliling = alas + tinggi + sisiMiring;

             setLuas(luas);
             setKeliling(keliling);
            }
         //getter
            public double getAlas() {
            return alas;
            }        
            public void setAlas(double alas) {
            this.alas = alas;
            hitungLuasKeliling();
            } 
         
         //setter
            public double getTinggi(){
            return tinggi;
            }
            public void setTinggi(double tinggi){
            this.tinggi = tinggi;
            hitungLuasKeliling();
            }
            
             public void tampilkanInformasi() {
             System.out.println("Informasi Segitiga:");
             System.out.println("Alas: " + alas);
             System.out.println("Tinggi: " + tinggi);
             System.out.println("Sisi Miring: " + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)));
             super.informasi();
         }
     }
     
     class Lingkaran extends BangunDatar{
         private double jariJari;
         private double PI = 3.14;
        
         public Lingkaran(double jariJari){
            super();
            this.jariJari = jariJari;
            hitungLuasKeliling();
         }
                //\\//\\====constructor=====//\\//\\
         public Lingkaran (double luas, double keliling, double jariJari){
            super(luas, keliling);
            this.jariJari = jariJari;
         }
         
         public void hitungLuasKeliling() {
            double luas = PI * jariJari * jariJari;
            double keliling = 2 * PI * jariJari;
            setLuas(luas);
            setKeliling(keliling);
         }
         
          public double getJariJari(){
             return jariJari;
         }
         
         public void setJariJari(double jariJari){
             this.jariJari = jariJari;
             hitungLuasKeliling(); // Update luas dan keliling saat jari-jari diubah
         }        
   
         public void tampilkanInformasi() {
             System.out.println("Informasi Lingkaran:");
             System.out.println("Jari-jari: " + jariJari);
             System.out.println("Diameter: " + (2 * jariJari));
             super.informasi();
         }
     
     }
     
     class Persegi extends BangunDatar{
          private double sisi;
          
          public Persegi(double sisi){
          super();
          this.sisi = sisi;
          hitungLuasKeliling();
          }
 
          public Persegi (double luas, double keliling, double sisi){
          super(luas, keliling);
          this.sisi = sisi;
          }
          
         //\\//\\metode perhitungan\\//\\//
          public void hitungLuasKeliling(){
          double luas = sisi * sisi;
          double keliling = 4 * sisi;
          setLuas(luas);
          setKeliling(keliling);
          }
          
            public double getSisi(){
            return sisi;
            }
            
            public void setSisi(double sisi){
            this.sisi = sisi;
            hitungLuasKeliling();
            }
             public void tampilkanInformasi() {
             System.out.println("Informasi Persegi:");
             System.out.println("Sisi: " + sisi);
             super.informasi();
          }
     }
    public static void main(String[] args) {
      BangunDatar bangunDatar = new BangunDatar();
        
        // Membuat objek Segitiga dengan constructor baru
        BangunDatar.Segitiga segitiga = bangunDatar.new Segitiga(6, 8);
        System.out.println("=== Segitiga ===");
        segitiga.tampilkanInformasi();
        
        // Mengubah nilai alas dan tinggi segitiga
        System.out.println("\nSetelah mengubah alas dan tinggi segitiga:");
        segitiga.setAlas(10);
        segitiga.setTinggi(15);
        segitiga.tampilkanInformasi();
        
        // Membuat objek Lingkaran dengan constructor baru
        BangunDatar.Lingkaran lingkaran = bangunDatar.new Lingkaran(7);
        System.out.println("\n=== Lingkaran ===");
        lingkaran.tampilkanInformasi();
        
        // Mengubah nilai jari-jari lingkaran
        System.out.println("\nSetelah mengubah jari-jari lingkaran:");
        lingkaran.setJariJari(14);
        lingkaran.tampilkanInformasi();
        
        // Membuat objek Persegi dengan constructor baru
        BangunDatar.Persegi persegi = bangunDatar.new Persegi(5);
        System.out.println("\n=== Persegi ===");
        persegi.tampilkanInformasi();
        
        // Mengubah nilai sisi persegi
        System.out.println("\nSetelah mengubah sisi persegi:");
        persegi.setSisi(10);
        persegi.tampilkanInformasi();
    }
    }
    

