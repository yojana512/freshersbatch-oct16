import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_8 extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		Lambda_8 t=new Lambda_8();
		t.start();
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(101);
		numbers.add(202);
		numbers.add(303);
		numbers.add(404);
		numbers.add(505);
		Consumer<ArrayList<Integer>>print=list ->list.stream().forEach(a->System.out.println(a+""));
		print.accept(numbers);
	}
}

