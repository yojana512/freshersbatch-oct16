
public class SiCi {

	public static void main(String[] args) {
		double amount=0,si,principle=1000,rate=10,time=3,ci;
		System.out.println("principle="+principle);
		System.out.println("rate="+rate);
		System.out.println("time="+time);
		si=(principle*rate*time)/100;
		System.out.println("The Simple Interest is :"+si);
		amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("The amount is :"+amount);
		ci=amount-principle;
		System.out.println("The Compound Interest is :"+ci);
		

	}

}
