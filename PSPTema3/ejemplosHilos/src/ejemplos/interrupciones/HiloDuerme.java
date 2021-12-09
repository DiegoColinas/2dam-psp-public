package ejemplos.interrupciones;

public class HiloDuerme extends Thread {

	@Override
	public void run() {
		//Saludamos
		System.out.println("\t Buenas! Soy el hijo que has pedido...Me duermo. Mi estado es: " 
								+ this.getState());
		//Dormimos y manejamos la excepci�n relacionada con la interrupci�n (de sue�o)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("\t Me han despertado de mi letargo. Mi estado es: " 
						+ this.getState());
		}
		//Nos despedimos
		System.out.println("\t M�s te vale tratarme bien, padre. Adi�s");
	}
}








