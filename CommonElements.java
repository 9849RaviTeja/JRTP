package array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int ar1[] = {1, 5, 10, 20, 40, 80};
int ar2[] = {6, 7, 20, 80, 100};
int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
int commonelements[];
int[] commonelements1;
int count=0;
int count1=0;
for(int i=0;i<ar1.length;i++) {
	for(int j=0;j<ar2.length;j++) {
		if(ar1[i]==ar2[j]) {
			count++;
		}
	}

}
commonelements= new int[count];
int index=0;
for(int i=0;i<ar1.length;i++) {
	
	for(int j=0;j<ar2.length;j++) {
		if(ar1[i]==ar2[j] ) {
			System.out.println("index before"+index);
			commonelements[index]=ar1[i];
			count++;
			index++;
			System.out.println("index is"+index);
		}
	}
}

System.out.println("count is"+count);
IntStream s1=Arrays.stream(commonelements).distinct();
s1.forEach(e->System.out.println(e));
System.out.println("count is"+count);

////////////////////logic2
System.out.println("///////////");
commonelements1= new int[count];
int index1=0;

for(int i=0;i<ar1.length;i++) {
	
	for(int j=0;j<ar3.length;j++) {
		if(ar1[i]==ar3[j] && ar1[i]>0 ) {
			System.out.println("index before"+index);
			commonelements1[index1]=ar1[i];
			System.out.println(ar1[i]+"hi");
			count1++;
			index1++;
			System.out.println("index1 is"+index1);
		}
	}
}
IntStream s2=Arrays.stream(commonelements1).distinct();
long i1=s2.count();
System.out.println(i1);
int[] c1=new int[(int) count];
int i2=0;
for (int i = 0; i < commonelements.length; i++) {
	
	for (int j = 0; j < commonelements1.length; j++) {
		if (commonelements[i]==commonelements1[j]) {
			c1[i2]=commonelements[i];
			System.out.println(commonelements[i]+"ji");
			i2++;
			System.out.println(i2);
		}
	}
	
}
IntStream commonelementsofarrays=Arrays.stream(c1).distinct();
commonelementsofarrays.forEach(e->{if(e>0)
	
System.out.println(e);
});


/////////////conclusion


	}}
	

