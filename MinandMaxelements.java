package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinandMaxelements {

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
System.out.println("Max Element"+a[0]);
System.out.println("Min Element"+a[a.length-1]);
	}

}
