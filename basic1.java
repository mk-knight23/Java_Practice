import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt("enter num1");
		int num2 = input.nextInt("enter num2");
		int sum = num1+num2;
		System.out.println("SUm is " + sum);
        System.out.println("こんにちは");
        
        // if Statrments 
        if(true){
            System.out.println("HelloMk");
        }
        
        // while statements 
        int count=1;
        while(count!=6){
            System.out.println(count);
            count++;
        }
        
        // for statements
        for(int count1=7;count1!=12;count1++){
            System.out.println(count1);
        }
		
	}
}
