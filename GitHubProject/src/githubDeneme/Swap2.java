package githubDeneme;

import java.util.Scanner;

public class Swap2 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
				

					
	int[] array = {12,23,67,56,78,89,45,34,29,30};
	swap(array);
	for(int i: array) {
		System.out.printf(i + " ");
	}
    }		
	public static void swap(int[] array) {
	for(int firstEl=0, lastEl=array.length-1;firstEl<=4;firstEl++,lastEl--) {
	int temp = array[lastEl];
	array[lastEl]=array[firstEl];
	array[firstEl]=temp;
	}				
	}
				
	}



