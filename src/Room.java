public class Room {

    private double area;
    private int temperature;
    private int minTemperature;
    private boolean hasConditioner;

    public Room(int temperature, int minTemperature, boolean hasConditioner) {
        this.temperature = temperature;
        this.minTemperature = minTemperature;
        this.hasConditioner = hasConditioner;
    }

    boolean reduceTemperature() {
        if (hasConditioner && temperature > minTemperature) {
            temperature--;
            return true;
        }
        else
            return false;
    }

    public double getArea() {
        return area;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public boolean getConditioner() {
        return hasConditioner;
    }

}
