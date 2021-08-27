import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Op implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toUpperCase();
   }
}
public class Lambda_6 {
   public static void main(String[] args) throws CloneNotSupportedException {
      ArrayList<String> list = new ArrayList<>();
      list.add("Ram");
      list.add("Rahim");
      list.add("Robert");
      list.add("John");
      list.add("Kushi");
      System.out.println("Contents of the list: "+list);
      list.replaceAll(new Op());
      System.out.println("\nContents of the list after replace operation: \n"+list);
   }
}

