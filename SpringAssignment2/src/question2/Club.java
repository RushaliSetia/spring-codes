package question2;

public class Club {

	int cId;
	String name;
	String owner;
	Player player;
	public Club() {
		// TODO Auto-generated constructor stub
	}

	public Club(int cId, String name, String owner) {
		super();
		this.cId = cId;
		this.name = name;
		this.owner = owner;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Club [cId=" + cId + ", name=" + name + ", owner=" + owner + ", player=" + player + "]";
	}

	
}
