package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindSmallestPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0;
		System.out.println("enter no of Elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();	
        Integer a[] = new Integer[n];
        System.out.println("Enter all the elements:");
        for(i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
System.out.println("Entered elements are");
for(i=0;i<a.length;i++) {
	System.out.println(a[i]);
}

Arrays.sort(a,Collections.reverseOrder());
System.out.println("After Sorting");
for(i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
int Smallpairsum= (a[a.length-2]+a[a.length-1]);
System.out.println("Smallest pair"+Smallpairsum);
	}

}
