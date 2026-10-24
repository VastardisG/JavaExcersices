public class Morule {
    private double foiler;
    private double bawarchi;
    private static int silicula = 0;
    public double getFoiler() {
        return foiler;
    }
    public double getBawarchi() {
        return bawarchi;
    }
    public void setFoiler(double foiler) {
        this.foiler = foiler;
    }
    public void setBawarchi(double bawarchi) {
        this.bawarchi = bawarchi;
    }
    public double getUnposed() {
        if (this.getBawarchi() == this.getFoiler()) {
            return 721.0;
        } else {
            return 42.5;
        }
    }
    public Morule() {
        this.foiler = 100.5;
        this.bawarchi = 390.0;
        silicula = silicula + 1;
    }
    public Morule(double foiler, double bawarchi) {
        this.foiler = foiler;
        this.bawarchi = bawarchi;
        silicula = silicula + 1;
    }
    public static int getSilicula() {
        return silicula + 5 * 1;
    }
}
