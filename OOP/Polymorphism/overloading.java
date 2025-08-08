package OOP.Polymorphism;

class sum {
    void add(int a,int b, int c){
        System.out.println("sum of three num is : "+(a+b+c));
    }

    void add(int a,int b){
        System.out.println("sum of two num is : "+(a+b));
    }
}


public class overloading {
    public static void main(String[] args){
        sum obj=new sum();
        obj.add(1,1,1);
        obj.add(2,2);
    }    
}
