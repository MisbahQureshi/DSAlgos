import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
			}
		
		rotate(2,arr);
		
		for (int i = 0; i < arr.length; i++) {  
		      System.out.println(arr[i]);
		      }
	}
	
	public static void reverse(int i, int j, int[] a) {
		int li=i;
		int ri= j;
		
		while(li<ri) {
		int temp=a[li];
		a[li]=a[ri];
		a[ri]=temp;
		
		li++;
		ri--;
		}
		
	}
	
	public static void rotate(int k, int[]a) {
		
		k= k % a.length;
		if(k<0) {
			k= k+a.length;
		}
		
		reverse(0, a.length-k-1, a);
		reverse(a.length-k,a.length-1 ,a);
		reverse(0,a.length-1,a);
		
	}

}
