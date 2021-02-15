
class Room {
	int roomno;
	String roomtype;
	double roomArea;
	int ACmachine;
	
	void setdata(int r, String rm, double ra, int ac){
		roomno = r;
		roomtype = rm;
		roomArea = ra;
		ACmachine = ac;
	}
	
	void displaydata(){
		 System.out.println("The room Number Is "   + roomno); 
         System.out.println ("The room type Is "  + roomtype);
         System.out.println ("The room area of the room Is "   + roomArea);   
         System.out.println("There are " + ACmachine + " A/c machine(s) in the room "); 
	}
}

public class Q6 {

	public static void main(String[] args) {
		Room sc = new Room();
		sc.setdata(101, "Deluxe", 546, 2);
		sc.displaydata();
		
	}

}
 


