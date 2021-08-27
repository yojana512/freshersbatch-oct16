public class Features1 {

	public static void main(String[] args) {
		
		Interest cal=(p,r,t) ->{
			return p+(p*r*t)/100;
		};
		System.out.println("Simple interest is :"+cal.SI(1000, 10, 10));
		
	}

}
interface Interest{
	int SI(int p, int r,int t);
}