package prob1;

import java.awt.color.CMMException;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		

		// 정렬 알고리즘 코드
		int temBox;
		int noProblemInt;
		
		for(noProblemInt = 0; noProblemInt < array.length ; ++noProblemInt) {
			
			for(int j = 0; j < array.length - 1 - noProblemInt; ++j) {
				if(array[j] < array[j+1]) {
					temBox = array[j+1];
					array[j+1] = array[j];
					array[j] = temBox;
				}
			}
			
		}
		
		
		
		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		

	}
}