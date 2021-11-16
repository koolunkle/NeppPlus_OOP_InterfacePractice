package Codes;

import Codes.datas.Marine;
import Codes.datas.Scv;
import Codes.datas.Zergling;

public class MainDrive {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		m1.move();
		m1.doAttack();

		Zergling z1 = new Zergling();
		z1.move();
		z1.doAttack();

		Scv scv1 = new Scv();
		scv1.move();
		scv1.getMineral();
		scv1.getGas();
		scv1.doAttack();

	}

}
