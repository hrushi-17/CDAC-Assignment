import java.util.Date;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 =new Vehicle(11, "Hrushi", "4 wheeler", new Date(2024,10,07));
		Vehicle v2 =new Vehicle(12, "Chinmay", "4 wheeler", new Date(2020,10,06));
		
		v1.display();
		v2.display();
		
		
		v2.setId(13);
		System.out.println("Updated Id: "+v2.getId());
		v2.display();
		
		System.out.println(v1);//This is toString Call 
		System.out.println(v2);//This is toString Call 
		

	}

}
