public class pegawai {

    /*************ATRIBUT*************/
    protected String NIP;
    protected String nama;
    protected tanggal tglLahir;
    protected tanggal TMT;
    protected String fakultas;
    protected int masaKerjaHari;
    protected double gajiPokok;

    /*************METHOD*************/
    public pegawai() {
        this.NIP = "";
        this.nama = "";
        this.tglLahir = new tanggal();
        this.TMT = new tanggal();
        this.fakultas = "";
        this.gajiPokok = 0;
    }

    public pegawai(String NIP, String nama, tanggal tglLahir, tanggal TMT, String fakultas, float gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.fakultas = fakultas;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public tanggal getTglLahir() {
        return tglLahir;
    }

    public tanggal getTMT() {
        return TMT;
    }

    public String getFakultas() {
        return fakultas;
    }

    public int getMasaKerjaHari() {
        return masaKerjaHari;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglLahir(tanggal tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setTMT(tanggal TMT) {
        this.TMT = TMT;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setMasaKerjaHari(int masaKerjaHari) {
        this.masaKerjaHari = masaKerjaHari;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    


    
}
