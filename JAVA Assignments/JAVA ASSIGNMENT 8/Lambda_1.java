public class Lambda_1 {

	public static void main(String[] args) {
		arthematic add=(a,b)->a+b;
		System.out.println(add.operation(25,35));
		arthematic sub=(a,b)->a-b;
		System.out.println(sub.operation(40,50));
		arthematic mul=(a,b)->a*b;
		System.out.println(mul.operation(100,220));
		arthematic div=(a,b)->a/b;
		System.out.println(div.operation(20,100));
		
	}
	interface arthematic
	{
		int operation(int a,int b);
	}

}

