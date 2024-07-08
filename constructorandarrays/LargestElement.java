package constructorandarrays;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		int max = ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("Largest element is: "+max);
	}


}
