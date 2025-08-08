package OOP.encap;
class data{
    private int age;
    private String name;
    
    void setname(String name){
        this.name=name;
    }
    void setage(int age){
        this.age=age;
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }

}
public class encap {
    public static void main(String[] args){
        data info= new data();
        info.setname("farfalla");
        info.setage(19);
        System.out.println(info.getname());
        System.out.println(info.getage());
    }
}
