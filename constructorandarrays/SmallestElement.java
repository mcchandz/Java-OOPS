package constructorandarrays;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		int min = ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("Smallest element is: "+min);
	}

}
