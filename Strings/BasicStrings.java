package Strings;

public class BasicStrings {

    public static void main(String[] args) {
        char ch[]={'H','e','l','l','o'};
        String str=new String(ch); //Converting character array to string .
        System.out.println("The given characters are : "+str);

        System.out.println("length of string is "+str.length() );

        // \r carriage return
        System.out.println("hello \rworld "); 
        
       
    }
}