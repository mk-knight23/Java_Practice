// SUm oF Fibonacci Series
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("ENter Number to find sum ");
	    int n =in.nextInt();
	    int a=0;
	    int b=1;
	    int count =2;
	    while(count<=n){
	        int temp=b;
	        b=b+a;
	        a=temp;
	        count++;
	    }
	    System.out.println("Total Sum Of Fibonacci Series is : " + b);
	}
}
