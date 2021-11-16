package Codes.datas;

import Codes.Interfaces.Attacker;

public class Zergling extends Unit implements Attacker {

	@Override
	public void doAttack() {
		System.out.println("몸통으로 5의 데미지를 줍니다.");

	}

}
