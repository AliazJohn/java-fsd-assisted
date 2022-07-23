import java.util.*;

class calc{
	int a,b;
	calc(int a, int b){
		this.a=a;
		this.b=b;
	}
	int addition() {
		return a+b;
		}
	int substract() {
		return a-b;
	}
	int multiply() {
		return a*b;
	}
	double divide() {
		double c=a;
		double d=b;
		return c/d;
	}
}

public class calculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first input: ");
		int num1=input.nextInt();
		System.out.print("Enter second input: ");
		int num2=input.nextInt();
		System.out.print("Enter the operator (+,-,*,/) : ");
		String op=input.next();
		double res=0;
		calc obj = new calc(num1,num2);
		switch(op) {
		case "+":
			res=obj.addition();
			break;
		case "-":
			res=obj.substract();
			break;
		case "*":
			res=obj.multiply();
			break;
		case "/":
			res=obj.divide();
			break;
		default:
			System.out.println("Invalid operator input!!!");
			
		}
		
		System.out.printf(num1 +op +num2 +" = " +" %.4f",res);
		
	}
}