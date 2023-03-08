package wang.test.room;

public class OpenRoom extends BasicRoom {
    Sofa sofa = new Sofa();
    Indicaor indicaor = new Indicaor();
    CommonWindow commonWindow = new CommonWindow();

    @Override
    BasicWindow getWindow() {
        return commonWindow;
    }

    @Override
    public void openWindow() {
    }
}
