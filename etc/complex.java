package complex;

public class complex {

	double real;
	double imaginary;
	
	public complex(double r,double i) {
		this.real=r;
		this.imaginary=i;
	}
	
	public complex(double R) {
		this.real=R;
	}
	
	public complex() {
		this.real=0;
		this.imaginary=0;
	}
	
	public double getR() {
		return real;
	}
	
	public double getI() {
		return imaginary;
	}
	
	public String toString() {
		return "Real part is : "+real+"\n"+"Imaginary part is : "+imaginary;
	}
	
	public static boolean equals(complex a,complex b) {
		if(a.getR()==b.getR()&&a.getI()==b.getI()) {
			return true;
		}
		else
			return false;
	}
	
	public static void add(complex a,complex b) {
		double Rp=a.getR()+b.getR();
		double Ip=a.getI()+b.getI();
		System.out.println(Rp+"+"+Ip+"i");
	}
	
	public static void sub(complex a,complex b) {
		double Rp=a.getR()-b.getR();
		double Ip=a.getI()-b.getI();
		System.out.println(Rp+"+"+Ip+"i");
	}
	
	public static void multi(complex a,complex b) {
		double Rp=a.getR()*b.getR();
		double Ip=a.getI()*b.getI();
		System.out.println(Rp+"+"+Ip+"i");
	}
	
	public static void Display(complex a) {
		System.out.println(a.toString());
	}
	
	public static void main(String[] args) {
		complex c1=new complex();
		complex c2=new complex(5,1);
		complex c3=new complex(5,3);
		
		System.out.println("<<<complex1>>>");
		Display(c1);
		System.out.println("<<<complex2>>>");
		Display(c2);
		System.out.println("<<<complex3>>>");
		Display(c3);
		
		System.out.println(equals(c1, c2));
		add(c3,c2);
		sub(c3,c1);
	}
	
	
}
