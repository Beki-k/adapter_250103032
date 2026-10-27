public class Main {
    public static void main(String[] args) {

        // Task 4
        System.out.println("\n===== TASK 4 =====");
        Device light = new SmartLight();
        AdvancedRemote remote = new AdvancedRemote(light);
        remote.powerOn();
        remote.mute();

        // Task 5
        System.out.println("\n===== TASK 5 =====");
        Device radio = new Radio();
        PartyRemote partyRemote = new PartyRemote(radio);
        partyRemote.partyMode();

        // Task 6
        System.out.println("\n===== TASK 6 =====");
        Hero knight1 = new Knight(new Sword());
        knight1.attack();

        Hero knight2 = new Knight(new MagicWand());
        knight2.attack();
    }
}
