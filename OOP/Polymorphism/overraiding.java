package OOP.Polymorphism;
class human{
    void purpose(){
        System.out.println("human: live a happy life");
    }
}

class man extends human{
    void purpose(){
        System.out.println("man: live a happy life");
    }
}

class woman extends man{
    void purpose(){
        System.out.println("woman: live a happy life");
    }

    void drama(){
        System.out.println("women are dramatic");
    }
}

public class overraiding {
    public static void main(String[] args){
    human obj = new human();
    obj.purpose();
    obj= new man();
    obj.purpose();
    new woman().purpose();
    obj=new woman();
    obj.purpose();
   ((woman)obj).drama();
    }
}
