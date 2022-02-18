
// Temperature In C AND F 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Temperature in C : ");
		Scanner in = new Scanner(System.in);
		float temC= in.nextFloat();
		float temF=(temC * 9/5) + 32 ;
		System.out.println("Temperature In F : " + temF);
		
	}
}
