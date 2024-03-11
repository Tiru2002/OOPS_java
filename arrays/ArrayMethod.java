package arrays;

public class ArrayMethod {

    public static String[] getWeekDay(){
        return new String[]{"Sunday","Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
    }
    
    // Method to print the week day names in an array.
    public static void printArray(String [] arr){
        
        for (int i =  0 ; i < arr.length ; i++){
            System.out.println("Element at index "+i+" is: "+arr[i]);
        }
    }

}
