import java.util.Scanner;
public class ExpHan1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int c=a/b;
			System.out.println("The Result of the expression is : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("The denominator cannot be zero");
		}
		System.out.println("End of the code..");
	}

}
