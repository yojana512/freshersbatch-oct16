import java.util.function.Predicate;
import java.util.function.Consumer; 
import java.util.function.Supplier;
class PredicateInterfaceExample {  
    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
}
class ConsumerInterfaceExample {  
    static void printMessage(String name){  
        System.out.println("Hello "+name);  
    } 
}
public class Lambda_3 {

	public static void main(String[] args) {
		 Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;    
	     boolean result = predicate.test(25);
	     System.out.println("Predicate Output");
	     System.out.println(result); 
	     System.out.println("\nConsumer Output");
	     Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;  
	     consumer1.accept("John");
	     System.out.println("\nSupplier Output");
	     Supplier<Double> randomValue = () -> Math.random();
	     System.out.println(randomValue.get());
	}
 
}
