package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
       /* for( i=0;i<a.length;i++) {
        for(int j=i=1;j<a.length;j++) {
        	if(a[i]==a[j]) {
        		a2[i]=a[i];
        	}
        }}
	
	for(int j=0;j<a2.length;j++) {
		System.out.println(a2[j]);}
	}*/
        Stream<Integer> stream=Arrays.stream(a).distinct();
        stream.forEach(e->System.out.print(e));
        
        
}}

