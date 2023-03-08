package wang.test.room;

public class CloseRoom extends BasicRoom {
    Silencer silencer = new Silencer();
    SoundproofWindow soundproofWindow = new SoundproofWindow();

    @Override
    BasicWindow getWindow() {
        return soundproofWindow;
    }

    @Override
    public void openWindow() {
    }
}
