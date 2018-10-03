package question2;

public class Player {

	int pId;
	String name;
	double pay;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int pId, String name, double pay) {
		super();
		this.pId = pId;
		this.name = name;
		this.pay = pay;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Player [pId=" + pId + ", name=" + name + ", pay=" + pay + "]";
	}
}
