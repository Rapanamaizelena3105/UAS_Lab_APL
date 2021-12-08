public class ImplRainAdapter implements RainAdapter {
    private Rain rain;

    public ImplRainAdapter(Rain rain) {
        this.rain = rain;
    }

    @Override
    public double getLuas() {
        double km = rain.getLuas();
        return convertMtoKM(km);
    }

    private double convertMtoKM(double m) {
        return m * 1000;
    }

    @Override
    public void jenis() {
        // biarkan kosong
    }
}