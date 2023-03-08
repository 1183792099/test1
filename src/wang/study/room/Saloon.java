package wang.study.room;

import wang.study.room.window.BasicWindow;
import wang.study.room.window.CommonWindow;

public class Saloon extends WindowRoom {
    Bookrack bookrack = new Bookrack();
    CommonWindow commonWindow = new CommonWindow();

    @Override
    BasicWindow getWindow() {
        return commonWindow;
    }
}
