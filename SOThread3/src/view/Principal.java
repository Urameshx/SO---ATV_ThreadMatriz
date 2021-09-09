package view;

import controller.ThreadControllerr;

public class Principal {

	public static void main(String[] args) {
		int[][] vet_num = new int[5][3];

		for (int l = 0; l < 5; l++) {
			for (int i = 0; i < 3; i++) {
				int num = (int) ((Math.random() * 100) + 1);
				vet_num[l][i] = num;
			}
		}

		ThreadController td1 = new ThreadController(vet_num[0]);
			td1.start();
		ThreadController td2 = new ThreadController(vet_num[1]);
			td2.start();
		ThreadController td3 = new ThreadController(vet_num[2]);
			td3.start();
	}

}
