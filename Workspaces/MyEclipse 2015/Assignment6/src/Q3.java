class Rectangle{
	
	int length;
	int breadth;

  public Rectangle(int l, int b){
	
	  length = l;
	  breadth = b;
	  
  }
  
  public  int Area(){
	 
	  int calc = length * breadth;
	  return calc;
	  
  }}

public class Q3 {
	
	public static void main(String[] args){
		    
		    Rectangle rec = new Rectangle(4,5);
		    Rectangle rec_ = new Rectangle(5,8);
		  
		    System.out.println("The Area of a Rectangle is "+ rec.Area());
		    System.out.println("The Area of a Rectangle is "+ rec_.Area());
		    
}}
