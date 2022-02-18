/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Sum Of 2 Numbers");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = num1+num2;
		System.out.println("summ is " + sum);
        System.out.println("Hello In Japenese Kon'nichiwa : こんにちは");
        
        // if Statrments 
        if(true){
            System.out.println("If True Print Hello In chinese Nǐ hǎo : 你好");
        }
        
        // while statements
        System.out.println("Numbers From 1 TO 6");
        int count=1;
        while(count!=6){
            System.out.println(count);
            count++;
        }
        
        // for statements
        System.out.println("Numbers From 7 TO 14");
        for(int count1=7;count1!=14;count1++){
            System.out.println(count1);
        }
		
	}
}
