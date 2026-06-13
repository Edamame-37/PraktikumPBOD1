class Kucing extends Anabul {
    private final double bobot; 

    public Kucing(String nama, double bobot) {
        this.panggilan = nama;
        this.bobot = bobot;
    }

    @Override
    public double getBobot() {
        return this.bobot;
    }
}