public class Depot<T extends Grocery> {

    private final double maxVolume;
    private double currentVolume;

    public Depot(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean add(T grocery, double weightKg) {

        double requiredVolume =
                grocery.getVolumePerKg() * weightKg;

        if (currentVolume + requiredVolume > maxVolume) {
            return false;
        }

        currentVolume += requiredVolume;
        return true;
    }

    public boolean remove(T grocery, double weightKg) {

        double volumeToRemove =
                grocery.getVolumePerKg() * weightKg;

        if (volumeToRemove > currentVolume) {
            return false;
        }

        currentVolume -= volumeToRemove;
        return true;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public double getFreeVolume() {
        return maxVolume - currentVolume;
    }

    public double getMaxVolume() {
        return maxVolume;
    }
}