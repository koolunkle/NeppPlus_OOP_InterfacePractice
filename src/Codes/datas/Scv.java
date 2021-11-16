package Codes.datas;

import Codes.Interfaces.Attacker;
import Codes.Interfaces.Worker;

public class Scv extends Unit implements Worker, Attacker {

	@Override
	public void doAttack() {
		System.out.println("SCV가 5의 데미지를 줍니다.");

	}

	@Override
	public void getMineral() {
		System.out.println("SCV가 미네랄을 8 캡니다.");

	}

	@Override
	public void getGas() {
		System.out.println("SCV가 가스를 8 캡니다.");

	}

}
