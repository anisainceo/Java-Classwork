import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static float getDistance(float[] d1, float[] d2) {
	    float dotx = d1[0] - d2[0];
	    float doty = d1[1] - d2[1];
	    return (float) Math.sqrt(dotx*dotx + doty*doty);
	}
	
	public static void main(String[] args) {
	    float max = 0;
		float min = 99999999;
		float myArr[][] = new float [8][2];
		Scanner input = new Scanner(System.in);
	    for (int i = 0; i < myArr.length; i++) {
	        for (int j = 0; j < myArr[i].length; j++) {
	    	    System.out.print("Enter the x and y's cordinates: ");
			    myArr[i][j] = input.nextFloat();
	        }
	    }
	    for (int i = 0; i < myArr.length-1; i++) {
	        for (int j = i+1; j < myArr.length; j++) {
	            max = Math.max(getDistance(myArr[i], myArr[j]), max);
	            min = Math.min(getDistance(myArr[i], myArr[j]), min);
	        }
	    }
	       System.out.println(Arrays.deepToString(myArr));
	       System.out.println("Maximum distance between these dots is: " +max);
	       System.out.println("Minimum distance between these dots is: " +min);

	   }
}

