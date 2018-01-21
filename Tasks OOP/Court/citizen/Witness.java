package citizen;

import enums.CitizenType;

public class Witness extends Citizen {

	public Witness(String name, String address, int age) {
		super(name, address, age);
		super.type = CitizenType.WITNESS;
	}

}
