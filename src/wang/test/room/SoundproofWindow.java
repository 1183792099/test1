package wang.test.room;

public class SoundproofWindow extends BasicWindow {
    SoundproofType type = SoundproofType.no;
    void setType(SoundproofType type){
        this.type = type;
    }

    @Override
    void open() {
        System.out.println("Open soundproof window");
    }
}
