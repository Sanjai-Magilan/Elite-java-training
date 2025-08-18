package BasicConcepts.strings;

public class stringg {
    public static void main(String[] args){
        String str="Hello World";
        System.out.println("length of the string      : "+str.length());
        String s=String.valueOf(str.charAt(4));
        System.out.println("At index 4                : "+s);
        System.out.println("Upper Case Char           : "+s.toUpperCase());
        boolean empt = str.isEmpty();
        System.out.println("Is the string empty       : "+empt);
        String dummy = "  hello world  ";
        System.out.println("trimmed                   : "+dummy.trim());
        System.out.println("front trimmed             : "+dummy.stripLeading());
        System.out.println("back trimmed              : "+dummy.stripTrailing());
    }
}
