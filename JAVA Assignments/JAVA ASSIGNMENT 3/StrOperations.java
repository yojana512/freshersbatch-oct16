
public class StrOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("Lowercase String is: "+s1.toLowerCase());
		System.out.println("Uppercasr String is: "+s1.toUpperCase());
		System.out.println("a replaced with $: "+s1.replace('a', '$'));
		String s2="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("Two Strings equal(true/false):"+s1.equals(s2));
		System.out.println("string contains collection Word(true/false):"+s1.contains("collection"));
		System.out.println("==match:"+(s1==s2));
		

	}

}
