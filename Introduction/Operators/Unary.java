package Introduction.Operators;

public class Unary {
 
    public static void main(String[] args) {
        
    
    int z=5 ,y=-8;
    // postfix :
       z++;
       y++;
       System.out.println("Postfix: Value of z = " +z+ ", Value of y = "+y);  

    //prefix:
       int a=5,b=-3;
       ++a;
       --b;
       System.out.println("prefix value of a=" +a+" and prefix value of b =" +b);


       int x=10;  
            System.out.println(x++);//10 (11)  
            System.out.println(++x);//12  
            System.out.println(x--);//12 (11)  
            System.out.println(--x);//10  
       
    
    }
}
