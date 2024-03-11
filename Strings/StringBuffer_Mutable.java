package Strings;

public class StringBuffer_Mutable {

    public static void main(String[] args) {
        // create a string buffer object
        StringBuffer sb = new StringBuffer("Hello");

        sb.append("world");
        System.out.println(sb);  //mutable
    }
    
}
