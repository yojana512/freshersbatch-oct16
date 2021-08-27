import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee<T> implements Comparable{
	private T[] arr;
    int id;
	String name;
	String dept;
	double salary;
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	Employee(){}
	
	 @Override
	public String toString() {
		return "("+id+", "+name+", "+dept+", "+salary+")";
	}
	public Integer toStringId() {
		return id;
	}
	public double toStringSalary() {
		
		return salary;
	}
	public String toStringDept() {
		
		return dept;
	}
	public String toStringName() {
		
		return name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Collection_3 {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> t= new HashSet<Employee>(); 
		Employee emp=new Employee();
		Employee[] e=new Employee[10];
		e[0]=new Employee<Object>(1,"Naresh","IT",20000);
		e[1]=new Employee<Object>(2,"Hemanth","Mech",21000);
		e[2]=new Employee<Object>(3,"Vijay","ECE",19000);
		e[3]=new Employee<Object>(4,"Rushi","EEE",22000);
		e[4]=new Employee<Object>(5,"Tharu","CIVL",40000);
		e[5]=new Employee<Object>(6,"Mahesh","IT",20000);
		e[6]=new Employee<Object>(7,"Srinu","Mech",21000);
		e[7]=new Employee<Object>(8,"Aki","ECE",19000);
		e[8]=new Employee<Object>(9,"Praveen","EEE",22000);
		e[9]=new Employee<Object>(10,"Sravya","CIVL",40000);
		t.add(e[0]);
		t.add(e[1]);
		t.add(e[2]);
		t.add(e[3]);
		t.add(e[4]);
		t.add(e[5]);
		t.add(e[6]);
		t.add(e[7]);
		t.add(e[8]);
		t.add(e[9]);
		System.out.println(t);
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<String> l2=new ArrayList<String>();
		ArrayList<String> l3=new ArrayList<String>();
		ArrayList<Double> l4=new ArrayList<Double>();
		Scanner sc=new Scanner(System.in);
		System.out.println("choose the below options:\n1 for Id\n2 for names\n3 for departments\n4 for salary ");
		int c=sc.nextInt();
		if(c==1) {
			Iterator value = t.iterator();
	        System.out.println("The Id's are: ");
	        while (value.hasNext()) {
	        	l1.add((Integer) ((Employee) value.next()).toStringId());
	        	}
	        Collections.sort(l1);
	        System.out.println(l1);
		}
		else if(c==2) {
			Iterator value = t.iterator();
	        System.out.println("The Names are: ");
	        while (value.hasNext()) {
	        	l2.add((String) ((Employee) value.next()).toStringName());
	        	}
	        Collections.sort(l2);
	        System.out.println(l2);
		}
		else if(c==3) {
			Iterator value = t.iterator();
	        System.out.println("The departments are: ");
	        while (value.hasNext()) {
	        	l3.add((String) ((Employee) value.next()).toStringDept());
	        	}
	        Collections.sort(l3);
	        System.out.println(l3);
		}
		else if(c==4) {
			Iterator value = t.iterator();
	        System.out.println("The salaries are: ");
	        while (value.hasNext()) {
	        	l4.add((Double) ((Employee) value.next()).toStringSalary());
	        	}
	        Collections.sort(l4);
	        System.out.println(l4);
		}
		else {
			System.out.println("Choose option between 1 to 4.");
		}
	}

}

    