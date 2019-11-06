package labarraysclass;
import java.util.Arrays;

public class LabArraysClass 
{
	public static void main(String[] args)
	{
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];
		
		// fill iArray2 with 7	
                
                Arrays.fill(iArray2, 7);
		
		// print iArray1 and iArray2 (toString)
                System.out.print("iArray1: ");
                System.out.println(Arrays.toString(iArray1));
                System.out.print("iArray2: ");
                System.out.println(Arrays.toString(iArray2));
		
		// search for number 9 in iArray1 and print the value returned:

                System.out.print("9 in iArray1: ");
                System.out.println(Arrays.binarySearch(iArray1, 9));
                
		// sort iArray1 and print it
                
                System.out.print("iArray1 sorted: ");
                Arrays.sort(iArray1);
                System.out.println(Arrays.toString(iArray1));

		// search for number 9 in iArray1 and print the value returned:

                System.out.print("9 in iArray1: ");
                System.out.println(Arrays.binarySearch(iArray1, 9));
		
		// create iArray3 and assign it the first 3 elements of iArray1; print it
                
                int[] iArray3 = Arrays.copyOfRange(iArray1, 0, 3);
                
                System.out.print("iArray3: ");
                System.out.println(Arrays.toString(iArray3));
				
		// test equality of new int[] {3, 6, 9} and iArray3; print result
                
                System.out.print("iArray3 equals [3, 6, 9]: ");
                System.out.println(Arrays.equals(iArray3, new int[] {3, 6, 9}));
		
                System.out.println("Reason: . . .");
	}
}