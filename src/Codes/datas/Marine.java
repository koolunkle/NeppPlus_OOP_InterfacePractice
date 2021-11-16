package Codes.datas;

import Codes.Interfaces.Attacker;

public class Marine extends Unit implements Attacker {

	@Override
	public void doAttack() {
		System.out.println("총으로 5의 데미지를 줍니다.");

	}

}
