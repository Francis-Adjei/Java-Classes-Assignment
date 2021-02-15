
class Triangle{
  int a;
  int b;
  int c;

public double getArea(){
    double s = (a + b + c ) / 2.0;
    double v =  Math.pow((s * ( s - a ) * ( s - b ) * ( s - c ) ), .5);
      return v;
}
    
  public double getPerimeter(){
       double d = ( a + b + c ) / 2.0;
	     return d;
  }
}

public class Q2 {
	 public static void main(String[] args){
		    Triangle tri = new Triangle();
		        tri.a = 3;
		        tri.b = 4;
		        tri.c = 5;
		    System.out.println(tri.getArea());
		    System.out.println(tri.getPerimeter());
		  }
		}	