package OOP.inheritance;
class base{
    void SoCalledMethod(){
        System.out.println("so called print statement");
    }
}

class branch0 extends base{
    void function(){
        System.out.println("branch 0 over over!");
    }
}

class branch1 extends base{
    void fun(){
        System.out.println("branch 1 over over!");
    }
}

public class hierarchy{
    public static void main(String[] args){
        branch0 obj = new branch0();
        branch1 jbo= new branch1();
        obj.SoCalledMethod();
        obj.function();
        jbo.SoCalledMethod();
        jbo.fun();
    }
}