package infracomp1;

import java.util.Scanner;

public class conThread extends Thread {

	private int name;
	private int n ;
	private int f;
	private int j;
	public conThread(int name,int n)
	{
		System.out.println("Extendiendo la clase thread.");
		this.j= n/2;
		this.n = n;
		this.name = name;
		this.f = name;
	}
	public void run() {
		try {
			
			for (int k = 0; k < j; k++) {
				
				f += 2;
				if (f<=n)
				{
				System.out.println("Thread: " +name+ " " + "valor: " + f);
				Thread.sleep(500);
				}
			}
		}
		catch (Exception e ) {}
	}
	
	public static void main (String [] args ) {
		
		System.out.println ("Por favor introduzca un valor");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in); 

        entradaTeclado = entradaEscaner.nextLine (); 
		
		conThread t0 = new conThread(0,Integer.parseInt(entradaTeclado));
		conThread t1 = new conThread(1,Integer.parseInt(entradaTeclado));
		
		
		t0.start();
		t1.start();
	}

	
}
