package wang.study.room;

import wang.study.room.window.BasicWindow;

import java.util.ArrayList;
import java.util.List;

public abstract  class StudyRoom {
    Saloon saloon = new Saloon();
    List<Room> rooms = new ArrayList<>();
}
