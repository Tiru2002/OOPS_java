package ClassAndObject;

public class Using_this {
    int x;
    int y;
    Using_this(int a, int b) {
        this.x=a;
        this.y =b;
}
public static void main (String[] args) throws Exception{
    // Creating objects of the class "Using_this"
    Using_this obj1 = new Using_this(5, 7);
    System.out.println("Value of 'x' in object obj1 is: "+obj1.x+" and value of 'y' in object obj1 is: "+obj1.y);
}
}