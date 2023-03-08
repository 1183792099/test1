public class MyPoint {
    int x,y;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(MyPoint a){
        return (x-a.x)+(y-a.y);
    }
    public double distance(int x,int y){
        return (x-this.x)+(y-this.y);
    }

}
