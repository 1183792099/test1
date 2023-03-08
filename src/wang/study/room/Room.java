package wang.study.room;

import wang.study.room.window.BasicWindow;
import wang.study.room.window.SoundproofWindow;

import java.util.ArrayList;
import java.util.List;

public class Room extends WindowRoom {
    SoundproofWindow soundproofWindow = new SoundproofWindow();
    List<Seat> seats = new ArrayList<>();

    @Override
    public BasicWindow getWindow() {
        return soundproofWindow;
    }


}
