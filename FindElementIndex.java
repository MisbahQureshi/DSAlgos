import java.util.Scanner;

public class FindElementIndex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
			}
		
		int x = scn.nextInt();
		int y = -1;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == x) {
				y = i;
				break;
			} 
			}
		System.out.println(y);
		
	}
}
