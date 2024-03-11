package arrays;

public class Two-dimensionalArray {

    public static void main(String[] args) {

    double  Slary [][]=new double [3][4]; //Declaration
    int year =2019;
    NumberFormat cf = NumberFormat.getCurrencyInstance(); 
    System.out.println("year\t\tNorth\t\tSouth\t\tEast\t\tWest");

    for(int y=0;y<Slary.length;y++){
        System.out.print(year+"\t");
        for(int x=0;x<=Slary[0].length -1 ;x++ ){
            Stem.out.print(cf.format(sales[y][region])); 
            System.out.print("\t"); 
        } 
        year++; 
        System.out.println(); 
    } 
    }




    
}
