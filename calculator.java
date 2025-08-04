public class calculator {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
    }
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.add(5, 1);
    }
}

