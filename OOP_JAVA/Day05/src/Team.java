
public class Team {
	private int id;
	private String tname;
	private Player captain;
	private Player [] plist;
	private int size;
	
	public Team() {
		super();
	}
	
	public Team (int id, String tname , Player captain, Player[] plist , int size) {
		this.id = id;
		this.tname = tname;
		this.captain = captain;
		this.plist = plist;
		this.size = size;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public void setPlist(Player [] plist) {
		this.plist = plist;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getId() {
		return id;
	}
	public String getTname() {
		return tname;
	}
	public Player getCaptain() {
		return captain;
	}
	public Player [] getPlist() {
		return plist;
	}
	public int getSize() {
		return size;
	}
	
	public String toString() {
		return "Id: " + id + ",Team Name: " +tname+ "Captain: " + captain + "Player list: " +plist+ "Size of Team: "+ size ; 
	}
	
}
