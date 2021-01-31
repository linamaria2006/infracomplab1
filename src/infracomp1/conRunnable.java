package infracomp1;

import java.util.Scanner;

public class conRunnable implements Runnable {

	private int name;
	private int n ;
	private int f;
	private int j;
	public conRunnable(int name,int n)
	{
		System.out.println("Implementando la interfaz runnable.");
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
		
		Thread t0 = new Thread(new conRunnable(0,Integer.parseInt(entradaTeclado)));
		Thread t1 = new Thread(new conRunnable(1,Integer.parseInt(entradaTeclado)));
		
		
		t0.start();
		t1.start();
	}

	
}
