abstract class Qpersistence{
	abstract void persist();
}

class FilePersistence extends Qpersistence{

	@Override
	void persist() {
		System.out.println("Persist method is implemented in FilePersistence subclass");	
	}	
}

class DatabasePersistence extends Qpersistence{

	@Override
	void persist() {
		System.out.println("Persist method is implemented in DatabasePersistance subclass");
	}	
}

public class Persistence {

	public static void main(String[] args) {
		
		Qpersistence FP=new FilePersistence();
		Qpersistence DP=new DatabasePersistence();
		
		FP.persist();
		DP.persist();

	}
}


