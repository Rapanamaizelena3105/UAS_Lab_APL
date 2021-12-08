public class ConvectiveRain implements Rain {
    @Override
    public void jenis() {
        System.out.println("Konvektif");
    }

    public double getLuas() {
        return 0.5;
    }
}