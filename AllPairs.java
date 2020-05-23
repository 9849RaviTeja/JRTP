package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AllPairs {

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
        System.out.println("Enter the number to find sum");
        int sum=sc.nextInt();
System.out.println("Entered elements are");
for(i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		int checkssum=a[i]+a[j];
		if (checkssum==sum) {
			System.out.println("("+a[i]+","+a[j]+")");
		}
	}
}


	}

}
