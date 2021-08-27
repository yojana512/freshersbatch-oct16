   import java.util.*;
class Employee{
	int id;
	String name;
	String dept;
	double salary;
	Employee(){}
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	void display(HashSet<Employee> o){
		for(Employee b:o){  
		    System.out.println(b.id+" "+b.name+" "+b.dept+" "+b.salary);  
	}
	}
}
class customer{
	
}
public class Gen_1 {
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(1,"A","CSE",30000);
		Employee e2=new Employee(2,"B","Mech",18000);
		Employee e3=new Employee(3,"C","ECE",25000);
		Employee e4=new Employee(4,"D","EEE",20000);
		HashSet<Employee> set=new HashSet<Employee>();  
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        e.display(set);
	}

}
