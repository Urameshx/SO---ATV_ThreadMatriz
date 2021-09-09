package controller;

public class ThreadController extends Thread {
	private int[] vet;

	public ThreadController(int[] vet) {
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
