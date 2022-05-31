import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRPN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		for(int i = 0; i< n; i++) {
			listOfNumbers.add(scn.nextInt());
		}
		
		RPN(listOfNumbers);
		System.out.println(listOfNumbers);
		
	}
	
	public static boolean isPrime(int number) {
		for(int d=2; d*d<= number; d++) {
			if(number % d == 0) {return false;}
		}
		
		return true;
	}
	
	
	public static void RPN(ArrayList<Integer> list) {
		for(int i = list.size()-1; i>=0; i--) {
			int number = list.get(i);
			if(isPrime(number)== true) {
				list.remove(i);
			}
		}
	}

}
