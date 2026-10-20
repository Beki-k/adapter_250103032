
interface ModernConsole {
    void playDigital();
}

class DigitalGame implements ModernConsole {
    public void playDigital() {
        System.out.println("Playing a modern digital game!");
    }
}

class RetroCartridge {
    public void insertCartridge() {
        System.out.println("Playing a retro cartridge game!");
    }
}

class CartridgeAdapter implements ModernConsole {
    private RetroCartridge cartridge;

    public CartridgeAdapter(RetroCartridge cartridge) {
        this.cartridge = cartridge;
    }

    public void playDigital() {
        cartridge.insertCartridge();
    }
}

public class RetroGamePlayer {
    public static void main(String[] args) {
        ModernConsole modernGame = new DigitalGame();
        modernGame.playDigital();

        RetroCartridge retroGame = new RetroCartridge();
        ModernConsole adapter = new CartridgeAdapter(retroGame);
        adapter.playDigital();
    }
}
