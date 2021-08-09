import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		double income,tax = 0;
		Scanner val=new Scanner(System.in);
		System.out.println("Enter CTC");
		income=val.nextDouble();
		if(income<=180000)
			tax=0;
		else if(income<=300000)
			tax=0.1*(income-180000);
		else if(income<=500000)
			tax=0.2*(income-300000)+12000;
		else if(income<=1000000)
			tax=0.3*(income-500000)+52000;
		System.out.println("Tax ammount is: "+tax);

	}

}
