package Strings;

public class String_Immutable {
    
    public static void main(String[] args) {
        // Immutability of string in Java  
        //In java, strings are immutable.  This means that once a string is created it cannot be changed.

        String str=new String("Tiru");
        str.concat("software");
        System.out.println(str);
        String str2=str.concat("developer");//refereance variable  points to new memory location
        System.out.println(str2);
    }
}
