import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[][] myArray = new double[7][8];						
		for (int x = 0; x < myArray.length; x++) {
	        for (int y = 0; y < myArray[x].length; y++) {
	        	myArray[i][j] = (Math.random() * 100 + 1);
	        }
		}
		System.out.print (" Sum of the array is: " + sumArray(myArray));
	}
    public static double sumArray(double arRay[ ] [ ] ) { 
    	
    	double sum = 0;
    	for (int x = 0; x < arRay.length; x++) {
    	    for (int y = 0; y < arRay[i].length; y++) {
    	        sum += arRay[x][y];
    	    }
    	}
    	return sum;
    }
}


