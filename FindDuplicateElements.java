package array;

import java.util.Iterator;
import java.util.Scanner;

public class FindDuplicateElements {
	int dup[] ;
	public void duplicateElements(int arr[]) {
		System.out.println("arr");
		
		int z=0;
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println("Assignment1");
		System.out.println("duplicates elements are");
			for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
		
		System.out.println(arr[i]);
				}
			}}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int i=0;
		System.out.println("enter no of Elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();	
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
System.out.println("Entered elements are");
for(i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
//15252
FindDuplicateElements fds=new FindDuplicateElements();
//Assignment1
fds.duplicateElements(a);


	}
}
