package ClassAndObject;
public class Class_Object {
    //class  is a blueprint for creating objects in java.
    //An object is an instance of the class
    int x=10;//instance variable or member variable
    public void  display(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        //creating object using new keyword
        Class_Object obj = new Class_Object();
        //accessing the method using dot operator
        obj.display();
    }
    
}
