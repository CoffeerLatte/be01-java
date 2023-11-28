package day06_sort;

;

public class BubbleSort {
public static void main(String[] args) {
	
	
int[] a = {1,3,2,5,7};
int temp;	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+"\t");
	}
	
	
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			
			
			if(a[i] < a[j+1])
			{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				
			}
		}
	}
	
	System.out.println("\n ****************** sort gn");
	
	for (int i = 0; i < a.length; i++) {
		System.out.println();
	}
	
	
	
	}
	
	
	
	
}
	

