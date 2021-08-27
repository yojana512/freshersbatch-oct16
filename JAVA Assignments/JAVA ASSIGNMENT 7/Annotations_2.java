import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;  
 
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	double AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	int version();
}
//info(AuthorID=1,Author="Ramesh",Supervisor="Sravs",date="11-8-2020",Time="10:30Am",version=3)
class Devoloper{
	@info(AuthorID=10001,Author="Ramesh",Supervisor="Sravs",Date="11-8-2020",Time="10:30Am",version=3)
	public void Data() {
		System.out.println("Hello Annotation");
	}
	
}
public class Annotations_2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Devoloper d=new Devoloper();
		Method p=d.getClass().getMethod("Data");
		info person=p.getAnnotation(info.class);
		System.out.println("AuthorID: "+person.AuthorID());  
		System.out.println("AuthorName: "+person.Author());  
		System.out.println("Supervisor: "+person.Supervisor());  
		System.out.println("Date: "+person.Date());  
		System.out.println("Time: "+person.Time());  
		System.out.println("Version: "+person.version());  
	}

}
