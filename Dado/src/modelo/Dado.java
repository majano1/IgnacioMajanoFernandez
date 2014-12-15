package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };
	public int numerotiradas=0;
	public int cara1=0;
	public int cara2=0;
	public int cara3=0;
	public int cara4=0;
	public int cara5=0;
	public int cara6=0;

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}
	
	
	public void realizarTest(int numerotiradas) {
		
		for (int i=1;i<=numerotiradas;i++) {
		
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		
		if (cara==1) {
			cara1=cara1+1;			
		}
		
		if (cara==2) {
			cara2=cara2+1;			
		}
		
		if (cara==3) {
			cara3=cara3+1;			
		}
		
		if (cara==4) {
			cara4=cara4+1;			
		}
		
		if (cara==5) {
			cara5=cara5+1;			
		}
		
		if (cara==6) {
			cara6=cara6+1;			
		}
		}
		
		System.out.println("Cara 1 ha salido "+cara1+" veces");
		System.out.println("Cara 2 ha salido "+cara2+" veces");
		System.out.println("Cara 3 ha salido "+cara3+" veces");
		System.out.println("Cara 4 ha salido "+cara4+" veces");
		System.out.println("Cara 5 ha salido "+cara5+" veces");
		System.out.println("Cara 6 ha salido "+cara6+" veces");
			
		
		
	}

}
