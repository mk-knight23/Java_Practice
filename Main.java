package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        sum();
        hello();
    }
    static  void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter Number 1st ");
        num1 = in.nextInt();
        System.out.println("Enter Number 2nd");
        num2 = in.nextInt();
        sum = num1+ num2;
        System.out.println("SUm is : " + sum);
    }
    static  void  hello(){
        String Name1;
        System.out.println("Enter NAME ");
        Scanner sc = new Scanner(System.in);
        Name1 = sc.nextLine();
        System.out.println("name is" + Name1);
    }
}
