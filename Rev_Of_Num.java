// Reverse of Numbers 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n =in.nextInt();
		int rev=0;
		while(n>0){
		    int rem = n%10;
		    n=n/10;
		    rev=rev*10+rem;
		}
		System.out.println("Reverse of Number : " + rev);
	}
}
