class Employee{
	int id;
	String name;
	int salary;
	int totalSal=0;
	public void totalSalary(int salary) {
		totalSal+=salary;
	}
}
class Manager extends Employee{
	int incentive;
	Manager(int id,String name,int salary,int incentive){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.incentive=incentive;
	}
	public int totalSalary() {
		return totalSal+=(salary+incentive);
	}
	
}
class Labour extends Employee{
	int extraTimeSal;
	Labour(int id,String name,int salary,int extraTimeSal){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.extraTimeSal=extraTimeSal;
	}
	public int totalSalary() {
		return totalSal+=(salary+extraTimeSal);
	}
}
public class Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(1,"Ram",50000,5000);
		System.out.println((m.name)+" has earned Rs."+m.totalSalary());
		Labour L=new Labour(2,"Laxman",4000,400);
		System.out.println((L.name)+" daily wage is Rs."+(L.totalSalary()));

	}

}

