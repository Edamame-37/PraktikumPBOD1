public class MDosenTetap {
    public static void main(String[] args) {
        dosenTetap dt = new dosenTetap();
        dt.setNIP("123456789");
        dt.setNIDN("987654321");

        dt.setNama("Dr. John Doe");
        tanggal t1 = new tanggal(1, 1, 1970);
        tanggal TMT1 = new tanggal(1, 1, 2000);
        dt.setTglLahir(t1);
        dt.setTMT(TMT1);
        dt.setFakultas("Teknik");
        dt.setGajiPokok(5000000);
        dt.setMasaKerjaHari(999980164);

        dt.printInfo();

        
    }
    
}
