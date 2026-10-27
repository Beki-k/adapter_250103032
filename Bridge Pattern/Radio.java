public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio starts playing static/music.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio shuts off.");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Radio volume knob turned to: " + level);
    }
}
