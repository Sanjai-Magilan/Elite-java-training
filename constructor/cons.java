package constructor;
class DoesNothing{
    DoesNothing() {
        System.out.println("Nothing");
    }
    void something(){
        System.out.println("Printing smgth");
    }
}
public class cons {
    public static void main(String[] args){
        DoesNothing ntg = new DoesNothing();// creating an object 
        new DoesNothing();//call constructor only not creating an obj
        ntg.something();
    }
}
