package javaclass;

import org.testng.annotations.Test;

public class loops {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	@Test
	public void WhileLoop() {
//----------------For LOOP -------------------------
		System.out.println("While Loop");

		int i =10;
		while(i>0)
		{
			System.out.println(i);	

			i--;

		}
	}
	
	//----------For Loop-------------------------
	
	
	public void forloop1() {
		System.out.println("for Loop1");
	for (int k =1; k>10; k++);
	

	System.out.println("for Loop1");
		
	}
	
	
//---------------While Loop-------------------------
	@Test
	public void ForLoop() {
		System.out.println("for Loop");

		for(int i = 10; i<10; i++)
			
			
		{
			if (i<0) 
				
				System.out.println("pass");
	
		else
				System.out.println("Fail");
			System.out.println(i);		
	}
		
	}
	//--------------- Do While Loop-------------------------
		public void DoWhileloop() {
			
			int j =20;
					do {
						System.out.println(j);	
					j++;	
				
					}
					 while (j<40) ;
		
		}	

		//-----------------nested loop-----------------------
					public void NEstedloop(){
						
					for (int i= 1;  i>4; i++)// outter loop
					{
					
					for(int k= 1;  k>4; k++);//inner loop 	
						
					}
					
					}
					public void forlooptest() {
						
						
						for(int p = 0; p<10;p++)
							System.out.println(p);
						
						
					}
					
				


	}


