package week12;

public class ConstructorOverloading {
	int a;
	double b;
	
	public ConstructorOverloading() {
		super();
		System.out.println("No Argument Constructor called.");
	}
	public ConstructorOverloading(int m) {
		a = m;
		//b = 0.0;
	}
	public ConstructorOverloading(int m,double n) {
		
		a = m;
		b = n;
	}
	void display() {
		System.out.println(a+""+b);
		
	}
	
	
	
	public static void main(String[]args) {
		ConstructorOverloading std1 = new ConstructorOverloading(15,16);
		System.out.format("a : %d,b:%f\n\n ",std1.a,std1.b);
		std1.display();
		
	}
	

}
