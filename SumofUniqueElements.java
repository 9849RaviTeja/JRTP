package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumofUniqueElements {
public static void main(String[] args) {
	int i,n=0;
	
	System.out.println("enter no of Elements");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();	
    Integer a[] = new Integer[n];
    Integer a2[] = new Integer[n];
    System.out.println("Enter all the elements:");
    for(i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    Stream<Integer> stream = Arrays.stream(a);
    Object[] uniqueArray=Arrays.stream(a).distinct().toArray();
    int sum = 0;
   
    for (Object object : uniqueArray) {
    	int v=(int) object;
		sum=sum+v;
	}
    System.out.println("\\\\");
    System.out.println(sum);
    stream.close();
}
}
