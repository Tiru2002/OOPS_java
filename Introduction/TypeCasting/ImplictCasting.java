package Introduction.TypeCasting;

public class ImplictCasting {


    public static void main(String[] args) {
        short s=10;
        int n =s;
        System.out.println("int: "+n);
        float f= n; //Implicit Casting - Widening Primitive Type Conversion
        System.out.println("float :  " +f);

        double d=f;
        System.out.println( "double: "+d);//Implicit Casting - Narrowing Primitive Type Conversion
    }
    
}
