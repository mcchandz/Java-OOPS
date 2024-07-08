package constructorandarrays;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		float sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		
		float avg = sum/size;
		System.out.println("Sum of array elements is: "+sum);
		System.out.println("Average of array elements is: "+avg);
	}

}
