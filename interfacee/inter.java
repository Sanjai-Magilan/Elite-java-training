package interfacee;
interface daddy {
    void land();
}

interface debts {
    void debt();
}
class sonone implements daddy,debts{
    public void land(){
        System.out.println("son1: land is mine");
    }
    public void debt(){
        System.out.println("son1: you pay the debts");
    }
}

class sontwo implements daddy,debts{
    public void land(){
        System.out.println("son2: no its mine");
    }
    public void debt(){
        System.out.println("son2: no, you pay the debts");
    }
}
public class inter {
    public static void main(String[] args){
        sonone obj = new sonone();
        sontwo jbo = new sontwo();
        obj.land();
        jbo.land();
        obj.debt();
        jbo.debt();
    }
}
