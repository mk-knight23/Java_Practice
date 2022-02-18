
// COunt The OCuurence oF Digit in A Numbers 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Whole Number");
		int n =in.nextInt();
		System.out.println("Enter digit to find its Occurence");
		int digit =in.nextInt();
		int count=0;
		while(n>0){
		    int rem = n%10;
		    if(rem==digit){
		        count++;
		    }
		    n=n/10;
		}
		System.out.println("Digit " + digit + "Appers " + count + "Times");
	}
}
