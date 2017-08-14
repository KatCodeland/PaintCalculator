
package com.lyndajavaessential.paintcalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int windows,doors;
	double windowHeight,windowWidth,doorHeight,doorWidth, paintSurfaceArea,sapg; //sapg = surface area per gallon
	double[]houseDimensions = new double[3]; //length, width & height respectively
		double gallonsNeeded,totalDoorWindowSA,houseSA; // SA=surface area

        Scanner in = new Scanner (System.in);
		System.out.println("Enter the length, width & height of your house");
		houseDimensions[0] = in.nextDouble(); //length
		houseDimensions[1] = in.nextDouble(); //width
		houseDimensions[2] = in.nextDouble(); //height

		System.out.println("Enter the number of external doors");
		doors = in.nextInt();

		System.out.println("Enter the door width & height");
		doorWidth = in.nextDouble();
		doorHeight = in.nextDouble();

		System.out.println("Enter the number of windows");
		windows = in.nextInt();

		System.out.println("Enter the size of a window");
		windowWidth = in.nextDouble();
		windowHeight = in.nextDouble();

		System.out.println("Enter the surface area coverage that a gallon covers");
		sapg = in.nextDouble();

houseSA = ((houseDimensions[0]*houseDimensions[2]*2)+(houseDimensions[1]*houseDimensions[2]*2));
totalDoorWindowSA = ((windowWidth*windowHeight*windows)+ (doorWidth*doorHeight*doors));
paintSurfaceArea = houseSA - totalDoorWindowSA;
gallonsNeeded = paintSurfaceArea / sapg;

		System.out.printf("The total surface area of the house that you will need to paint is: %6.2f ", paintSurfaceArea);
		System.out.printf("You will need %6.2f gallons of paint",gallonsNeeded);
    }
}
