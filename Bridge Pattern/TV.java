public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV turns on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turns off.");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("TV volume set to: " + level);
    }
}
