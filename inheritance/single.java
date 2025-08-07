package inheritance;

class parent{
    parent(){
        System.out.println("i'm parent");
    }
    void gen0(){
        System.out.println("dad's assessets");
    }
}

class son extends parent{
    void gen1(){
        System.out.println("son's assessets");
    }
}

class grandson extends son{
    void gen2(){
        System.out.println("grandson's assessets");
    }
}

public class single {
    public static void main(String[] args){
        grandson obj = new grandson();
        obj.gen0();
        obj.gen1();
        obj.gen2();
    }    
}
