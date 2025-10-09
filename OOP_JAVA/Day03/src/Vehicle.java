import java.util.Date;

public class Vehicle {

	private int id;
	private String oName;
	private String tOfVeh;
	private Date dOfPurch;
	
	Vehicle(){
		id = 0;
		oName = null;
		tOfVeh = null;
		dOfPurch = null;
	}
	
	Vehicle(int id, String oName, String tOfVeh, Date dOfPurch){
		this.id =id;
		this.oName = oName;
		this.tOfVeh = tOfVeh;
		this.dOfPurch = dOfPurch;
	}
	
	//setter
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setOName(String name) {
		this.oName = oName;
	}
	
	public void setTOfVeh(String tOfVeh) {
		this.tOfVeh = tOfVeh;
	}
	
	public void setDOfPurch(Date dOfPurch) {
		this.dOfPurch = dOfPurch;
	}
	
	//getter
	public int getId() {
		return id;
	}
	
	public String getOName() {
		return oName;
	}
	
	public String getTOfVeh() {
		return tOfVeh;
	}
	
	public Date getDOfPurch() {
		return dOfPurch;
	}
	
	//display
	
	public void display() {
		System.out.println("=============================================");
		System.out.println("Vehicle Details: ");
		System.out.println("ID: "+id);
		System.out.println("Owner Name: "+oName);
		System.out.println("Type Of Vehicle: "+tOfVeh);
		System.out.println("Date Of Purchase: "+dOfPurch);
		System.out.println("=============================================");
		
	}
	
	public String toString() {
		System.out.println("=============================================");
		System.out.println("This is Vehicle Details using toString: ");
		return "ID: "+id+"Owner Name: "+oName+"Type Of Vehicle: "+tOfVeh+"Date Of Purchase: "+dOfPurch;
	}
}
