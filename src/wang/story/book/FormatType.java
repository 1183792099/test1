package wang.story.book;

public enum FormatType {
    eight(100),sixteen(50);
    private int format;
    FormatType(int format){
        this.format = format;
    }
    public int toInt(){
        return this.format;
    }
}
