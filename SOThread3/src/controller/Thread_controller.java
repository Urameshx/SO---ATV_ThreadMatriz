package controller;

public class Thread_controller extends Thread {
	private int[] vet;

	public Thread_controller(int[] vet) {
		this.vet = vet;
	}

	@Override
	public void run() {
		Vetor();
	}
	
	private void Vetor() {
		int aux = 0;
		
		for (int i = 0; i < vet.length; i++) {
			aux += vet[i];
		}
		
		System.out.println("Thread nº:" +  getId() + " = " + aux);
	}
}