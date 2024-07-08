package constructorandarrays;

import java.util.Scanner;

public class AddElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size: ");
	int size = sc.nextInt();
	int[] ar = new int[size];
	System.out.println("Enter array elements: ");
	
	for(int i=0;i<ar.length;i++) {
		ar[i] = sc.nextInt();
	}
	
	System.out.println("Enter array element to be added and the index within "+(size-1)+":");
	int n = sc.nextInt();
	int j = sc.nextInt();
	ar[j]=n;
	
	System.out.println("New array is: ");
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	
  }
}
