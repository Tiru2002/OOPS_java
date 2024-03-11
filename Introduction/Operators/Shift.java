package Introduction.Operators;

public class Shift {
    
    public static void main(String[] args) {
        int a=21;
        int b=-12;

        //left shift:
        System.out.println("Left shift \n" + (a << 2));//3*2=6*2=1;
        System.out.println(b<<2);//12*2^2=48

        //rigth shift:
        System.out.println("\nRight shift");
        System.out.println((-a)>>>2);//-3/4 rounded down to -1
        System.out.println(-b >>> 2);//-12/4 rounded down to -1
        System.out.println(a>>3);
        System.out.println(a>>>2);//unsigned right shift,


    }
}
