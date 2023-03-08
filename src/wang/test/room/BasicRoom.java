package wang.test.room;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicRoom implements CanOpenWindow {
    //List<Seat> seats = new ArrayList<>();

    abstract BasicWindow getWindow();
}
