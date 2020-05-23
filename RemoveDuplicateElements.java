package array;

import java.util.Scanner;



public class RemoveDuplicateElements {
	static int n=0;
	public void removeDuplicateElements(int []arr) {
		int count=0;
		int ar[] = null;
		int a[]=null;
			System.out.println("Assignment2");
		System.out.println(" no of duplicates elements  ");
			for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
		System.out.println(arr[i]+""+"hi");
		count++;
				}
			}}
		
			 ar =new int[count];
			 System.out.println("New array Size"+ar.length);
			for(int z=0;z<ar.length;z++) {
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if (arr[i]==arr[j]) {
			ar[z]=arr[i];
					}
					
				}
				z++;
			}
			}
			System.out.println("new Array");
			for (int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
			int k=arr.length-ar.length;
			// a[] = new [z];
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<ar.length;j++) {
//					
//				}
//			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
RemoveDuplicateElements rde=new RemoveDuplicateElements();
rde.removeDuplicateElements(a);

	}

}
