import java.util.Scanner;

class Area{
	
	int length;
	int breadth;

  public Area(int l, int b){
	
	  length = l;
	  breadth = b;
	  
  }
  
  public  int returnArea(){
	 
	  int calc = length * breadth;
	  return calc;
	  
  }}

public class Q4 {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		    int l;
		    int b;

		    System.out.print("Enter Value for length: ");
		    l = sc.nextInt();
		    
		    System.out.print("Enter Value for  breadth: ");
		    b = sc.nextInt();
		    
	       Area rec = new Area( l , b );
	       System.out.println("Area : " + rec.returnArea());
	       sc.close();

}}
