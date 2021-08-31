package view;

import controller.Thread_controller;

public class Principal {

	public static void main(String[] args) {
		int[][] vet_num = new int[5][3];

		for (int l = 0; l < 5; l++) {
			for (int i = 0; i < 3; i++) {
				int num = (int) ((Math.random() * 100) + 1);
				vet_num[l][i] = num;
			}
		}

		Thread_controller td1 = new Thread_controller(vet_num[0]);
			td1.start();
		Thread_controller td2 = new Thread_controller(vet_num[1]);
			td2.start();
		Thread_controller td3 = new Thread_controller(vet_num[2]);
			td3.start();
	}

}