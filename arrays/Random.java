package arrays;

public class Random {

    public static void main(String[] args) {
        int [] arr= new int [50];

    for(int i=0 ;i<arr.length;i++){
        arr[i]=(int) (Math.random()*50+1); //generates random numbers between 0 and 50
    }

    for(int j: arr){
        System.out.print(j + " | ");      
    }

    
    
    
    }
    
}
