package javaclass;

public class Trafic implements CentrralTrafic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Trafic t= new Trafic();
		t.redStop();
		t.flasYellow();
		t.greengo();
	}

	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green Stop light implimentaion");
	}

	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop light implimentaion");
		
	}

	public void flasYellow() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Yellow  Stop light implimentaion");
	}

}
