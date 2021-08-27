import java.util.ArrayList;
import java.util.List;

public class Lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("Ram");
		l.add("Robin");
		l.add("Rahim");
		l.add("Singh");
		l.add("Rawath");
		System.out.println("Original list is: "+l+"\n");
		l.removeIf(s -> (s.length() % 2 != 0));
		  System.out.println("List After oddlength Strings are removed is:  "+l);
        
	}
}

