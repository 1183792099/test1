package wang.test.animal;

import javax.swing.*;

public abstract class Animal implements Behavious {
    String plume;
    int foot;
    String fly;
    void setPlume(String plume){
        this.plume = plume;
    }
    void setFoot(int foot){
        this.foot = foot;
    }
    void setFly(String fly){
        this.fly = fly;
    }

}
