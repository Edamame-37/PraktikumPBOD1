public abstract class Anabul {
    protected String panggilan;

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public String getNama() {
        return this.panggilan;
    }

    public abstract double getBobot();
}