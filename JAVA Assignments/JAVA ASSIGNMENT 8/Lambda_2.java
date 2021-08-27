import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Orders{
	double id;
	double price;
	String status;
	public Orders(double id, double price, String status) {
		super();
		this.id = id;
		this.price = price;
		this.status = status;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orders [id=").append(id).append(", price=").append(price).append(", ");
		if (status != null)
			builder.append("status=").append(status);
		builder.append("]");
		return builder.toString();
	}
	
}
public class Lambda_2 {

	public static void main(String[] args) {
		
		Orders[] o= new Orders[5];
		o[0]=new Orders(1,10000,"Accepted");
		o[1]=new Orders(2,11000,"Completd");
		o[2]=new Orders(3,12500,"Accepted");
		o[3]=new Orders(4,9200,"Completed");
		o[4]=new Orders(5,5000,"Accepted");
		List<Orders> L=new ArrayList();
		L.add(o[0]);
		L.add(o[1]);
		L.add(o[2]);
		L.add(o[3]);
		L.add(o[4]);
		System.out.println("----Order price more than 10000----\n");
		condition(L,p->p.getPrice()>=10000);
		System.out.println("\n-----Order status Accepted-----\n");
		condition(L,p->p.getStatus()=="Accepted");
		System.out.println("\n----Order status Completed-----\n");
		condition(L,p->p.getStatus()=="Completed");
	}
	private static void condition(List<Orders> L1,data data) {
			for(Orders oo: L1)
			{
				if(data.test(oo))
				{
					System.out.println(oo);
				}
			}
		}
	interface data{
		boolean test(Orders o);
	}

}

