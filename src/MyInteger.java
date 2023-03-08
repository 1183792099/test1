public class MyInteger {
    int value;
    public MyInteger(int value){}

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        if(value%2 == 0)
            return true;
        else
            return false;
    }
    public boolean isOdd(){
        if(value%2 == 0)
            return false;
        else
            return true;
    }
    public boolean isPrime(){
        for(int i = 2;i<value/2;i++){
            if(value%i == 0)
                return false;
        }
        return true;
    }
    public static boolean isEven(int a){
        if(a%2 == 0)
            return true;
        else
            return false;
    }
    public static boolean isOdd(int a){
        if(a%2 == 0)
            return false;
        else
            return true;
    }
    public static boolean isPrime(int a){
        for(int i = 2;i<a/2;i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }
    public static boolean isEven(MyInteger b){
        if(b.value%2 == 0)
            return true;
        else
            return false;
    }
    public static boolean isOdd(MyInteger b){
        if(b.value%2 == 0)
            return false;
        else
            return true;
    }
    public static boolean isPrime(MyInteger b){
        for(int i = 2;i<b.value/2;i++){
            if(b.value%i == 0)
                return false;
        }
        return true;
    }
    /*public static int parseInt(char[] a){
        int b = (int)a;
        return b;
    }
    public static int parseInt(String a){
        int b = (int)a;
        return b;
    }*/
}
