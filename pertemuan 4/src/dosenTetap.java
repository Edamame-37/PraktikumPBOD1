public class dosenTetap extends pegawai {
    /*************ATRIBUT*************/
    protected String NIDN;
    protected static int BUP = 65;
    protected static String status = "Dosen Tetap";
    protected tanggal tglPensiun;

    /*************METHOD*************/
    public dosenTetap() {
        super();
        this.NIDN = "";
        this.tglPensiun = new tanggal();
    }

    public dosenTetap(String NIP, String nama, tanggal tglLahir, tanggal TMT, String fakultas, float gajiPokok, String NIDN, tanggal tglPensiun) {
        super(NIP, nama, tglLahir, TMT, fakultas, gajiPokok);
        this.NIDN = NIDN;
        this.tglPensiun = tglPensiun;
    }

    public String getNIDN() {
        return NIDN;
    }

    public int getBUP() {
        return BUP;
    }

    public String getStatus() {
        return status;
    }

    public tanggal getTglPensiun() {
        tanggal T = this.getTglLahir();
        int tahunPensiun = T.year + 65;
        tanggal tglPensiun = new tanggal(T.day, T.month, tahunPensiun);
        return tglPensiun;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public void setTglPensiun(tanggal tglPensiun) {
        this.tglPensiun = tglPensiun;
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + getNIDN());
        System.out.println("Nama: " + getNama());
        System.out.print("Tanggal Lahir: ");
        getTglLahir().printTanggal();
        System.out.print("TMT: ");
        getTMT().printTanggal();
        System.out.println("Jabatan: " + getStatus());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerjaHari() + " hari");
        System.out.print("Tanggal Pensiun: ");
        getTglPensiun().printTanggal();
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + (getGajiPokok() * tunjangan));

    }

    
}
