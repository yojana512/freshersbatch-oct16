import java.util.HashSet;
class duplicate{
	private int num;
	public duplicate(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		return builder.toString();
	}	
}

public class Collection_2 {

	public static void main(String[] args) {
		
		duplicate[] d=new duplicate[10];
		HashSet<Object> hs=new HashSet<Object>();
		d[0]=new duplicate(1);
		d[1]=new duplicate(1);
		d[2]=new duplicate(2);
		d[3]=new duplicate(2);
		d[4]=new duplicate(3);
		d[5]=new duplicate(3);
		d[6]=new duplicate(3);
		d[7]=new duplicate(3);
		d[8]=new duplicate(3);
		d[9]=new duplicate(3);
		hs.add(d[0]);
		hs.add(d[1]);
		hs.add(d[2]);
		hs.add(d[3]);
		hs.add(d[4]);
		hs.add(d[5]);
		hs.add(d[6]);
		hs.add(d[7]);
		hs.add(d[8]);
		hs.add(d[9]);
		hs.add(d[2]);
		hs.add(d[4]);
		System.out.println(hs.toString());
	}
}

    