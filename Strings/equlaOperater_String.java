package Strings;

public class equlaOperater_String {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 =new String("hello");

        System.out.println(str1 == str2); // checking rreferance address  of both string 

        System.out.println(str1.equals(str2));//checking the value of both string if they are equal
    }
    
}
