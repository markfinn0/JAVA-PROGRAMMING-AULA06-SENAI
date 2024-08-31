package section2_3.instanceof_operator;

import section2_3.Bicicleta;
import section2_3.MountainBike;
import section2_3.RoadBike;

public class InstanceofTester {

	public static void main(String[] args) {
//		MountainBike mountainBike1 = new MountainBike();
//		RoadBike roadBike1 = new RoadBike();
//		Bicicleta moutainBike2 = new MountainBike();
//		Bicicleta roadBike2 = new RoadBike();

		Bicicleta[] bikes = new Bicicleta[5];
		bikes[0] = new MountainBike("MB001", "Aço Carbono", "Raios de Metal", 20, 18, 25.0, "Soft");
		bikes[1] = new RoadBike("MB001", "Aço Carbono", "Raios de Plástico", 22, 24, 38.0, "Plug-in");

		for (Bicicleta bike : bikes) {
			if (bike instanceof RoadBike) {
				System.out.println(bike);
			}

//			System.out.println(bike);
		}
	}

}
