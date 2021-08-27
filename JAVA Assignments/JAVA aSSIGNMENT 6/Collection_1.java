import java.util.*;
enum Gender{
	Male,Female;
	}
class contact <T>{
	private T[] arr;
	long phoneNumber;
	String name;
	String Email;
	Object Gender;
	contact(){}
	public contact(String name, String email,Object Gender) {
		super();
		this.phoneNumber = this.phoneNumber;
		this.name = name;
		this.Gender=Gender;
		this.Email = email;
	} 
	public String toString() {
		return "["+name+", "+Email+", "+Gender+"]";
		 		
	}
}
public class Collection_1 {
	
	public static void main(String[] args) {
		
		Gender M=Gender.Male;
		Gender F=Gender.Female;
		contact[] obj=new contact[5];
		obj[0]=new contact<Object>("Ram","ramakanth@gmail.com",M);
		obj[1]=new contact<Object>("Shashi","shashikanth@gmail.com",M);
		obj[2]=new contact<Object>("Chandhrika","chandhrika@gmail.com",F);
		obj[3]=new contact<Object>("Krushil","krushi@gmail.com",M);
		obj[4]=new contact<Object>("Sai","sahithya@gmail.com",F);
		TreeMap<Long,contact> t= new TreeMap<Long,contact>(Collections.reverseOrder());
		t.put((long)999998888,obj[0]);
		t.put((long)989898989,obj[1]);
		t.put((long)868686868,obj[2]);
		t.put((long)978978978,obj[3]);
		t.put((long)888888888,obj[4]);
		
		System.out.println("***** KEYS *****\n");
		for(Map.Entry m1:t.entrySet()){ 
			System.out.println(m1.getKey());
		}
		System.out.println("\n***** VALUES *****\n");
			for(Map.Entry m:t.entrySet()){ 
				System.out.println(m.getValue().toString());
			}
			System.out.println("\n***** KEY VALUE PAIRS*****\n");
		for(Map.Entry m:t.entrySet()){ 
		       System.out.println(m.getKey()+" :"+m.getValue().toString());    
		      }    
	    }
        }

    