public class OrographicRain implements Rain {
    @Override
    public void jenis() {
        System.out.println("Orografis");
    }

    public double getLuas() {
        return 1.5;
    }
}