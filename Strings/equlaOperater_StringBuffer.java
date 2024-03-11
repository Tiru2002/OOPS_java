package Strings;

public class equlaOperater_StringBuffer { 

    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer("Hello");  
        StringBuffer sb1=new StringBuffer("HellO");  
        
        System.out.println(sb==sb1); // false

        System.out.println(sb.equals(sb1)); // refereance  is not same so it returns false
    }
    
}
