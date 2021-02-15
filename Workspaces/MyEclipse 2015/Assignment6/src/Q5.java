class Complex{
 
	int real;
 
	int imag;
  
  public Complex(int re, int im){
    
	  real = re;
   
	  imag = im;
	  
  }

  public static Complex add(Complex a, Complex b){
  
	  return new Complex((a.real+b.real),(a.imag+b.imag));
	  
  }

  public static Complex diff(Complex a, Complex b){
   
	  return new Complex((a.real-b.real),(a.imag-b.imag));
	  
  }

  public static Complex product(Complex a, Complex b){
   
	  return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
	  
  }
 
  public void printComplex(){
	  
	  if(real == 0 && imag!=0){
	     
	    	System.out.println(imag+"i");
	    }
	   
	  else if(imag == 0 && real!=0){
	      
		  System.out.println(real);
		  
	    }
	    
	  else{
	      
		  System.out.println(real+"+"+imag+"i");
		  
	    }
	  }

	}

public class Q5 {

	public static void main(String[] args) {
		
		Complex obj = new Complex(4,5);
		    Complex obj1 = new Complex(9,4);

		    Complex sum = Complex.add(obj,obj1);
		    Complex Substract = Complex.diff(obj,obj1);
		    Complex multiplication = Complex.product(obj,obj1);
		    sum.printComplex();
		    Substract.printComplex();
		    multiplication.printComplex();

	}

}
