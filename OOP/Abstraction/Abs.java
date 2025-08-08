package OOP.Abstraction;
abstract class sample{
    void add(int a,int b){
        System.out.println("Add = "+(a+b));
    }
    abstract void sub(int a,int b);
}

class samp extends sample{
   void sub(int a,int b){
        System.out.println("Sub = "+(a-b));
    }
}
public class Abs {
    public static void main(String[] args){
        samp obj = new samp();
        obj.add(6, 20);
        obj.sub(6, 20);
    }
}
