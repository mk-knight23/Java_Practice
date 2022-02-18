// Java Calculor 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
// 		Take User Imput
        // Take Ans
        int ans =0;
		while(true){
		  //  Take Operator As Input 
		    System.out.println("Enter Operator : ");
		    char op = in.next().trim().charAt(0);
		    if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
		      //  Input 2 Numbesrs 
		      System.out.println("Enter 2 Numbers : ");
		      int num1 = in.nextInt();
		      int num2 = in.nextInt();
		      
		      if(op == '+'){
		          ans = num1+num2;
		      }
		      if(op == '-'){
		          ans = num1-num2;
		      }
		      if(op == '*'){
		          ans = num1*num2;
		      }
		      if(op == '/'){
		          if(num2!=0){
		              ans = num1/num2;
		          }
		      }
		      if(op == '%'){
		          ans = num1%num2;
		      }
		      
		    }
		    else if (op == 'x' || op == 'X'){
		        break;
		    } 
		    else {
		        System.out.println("Invalid Operator");
		    }
		    System.out.println("Result Is : " + ans);
		}
	}
}
