package inheritance;
class basee{
    void SoCalledMethod(){
        System.out.println("so called print statement");
    }
}

class branch8 extends basee{
    void function(){
        System.out.println("branch 0 over over!");
    }
}

class branch9 extends basee{
    void fun(){
        System.out.println("branch 1 over over!");
    }
}

class unknown extends branch9{
    void known (){
        System.out.println("known is unknown and unknown is known");
    }
}

public class hybrid {
     public static void main(String[] args){
        branch0 obj = new branch0();
        unknown jbo = new unknown();
        obj.SoCalledMethod();
        obj.function();
        jbo.known();
        jbo.SoCalledMethod();
        jbo.fun();
        
    }
}

