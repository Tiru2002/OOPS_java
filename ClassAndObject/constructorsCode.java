package ClassAndObject;

public class constructorsCode {

    constructorsCode(){
        System.out.println("Default constructor called");
    }
    // parameterized constructor
    public constructorsCode(int a, String b){
        this();  // calling default constructor
        System.out.println("Parameterized constructor called with arguments : " +a+ ", "+b);
    }
}
class ConstructorExample{
    public static void main(String[] args) {
        
        // creating object using the default constructor
        constructorsCode obj1 = new constructorsCode();
        constructorsCode obj2=new constructorsCode(9,"Hello World!");
    

        
}

}

