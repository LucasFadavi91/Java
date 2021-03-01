package ejVinilo;

import java.util.TreeSet;

public class Balda {
	
	private TreeSet<Vinilo> balda;

	public TreeSet<Vinilo> getBalda() {
		return balda;
	}

	public void setBalda(TreeSet<Vinilo> balda) {
		this.balda = balda;
	}

	//constructor
	public Balda() {
		super();
		
	}
	
	public void addVinilo(Vinilo vinilo) {
		if(this.balda==null)
			this.balda=new TreeSet<Vinilo>();
	
		this.balda.add(vinilo);
	}

	@Override
	public String toString() {
		return "Balda [balda=" + balda + "]";
	}

	
}