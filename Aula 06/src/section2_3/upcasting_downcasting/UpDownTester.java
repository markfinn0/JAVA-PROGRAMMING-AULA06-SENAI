package section2_3.upcasting_downcasting;

import section2_3.Bicicleta;
import section2_3.MountainBike;

public class UpDownTester {

	public static void main(String[] args) {
		Bicicleta mountainBike = (Bicicleta) new MountainBike("MB001", "Aço Carbono", "Raios de Metal", 20, 18, 25.0, "Soft");
		
		System.out.println(mountainBike);
		System.out.println(((MountainBike) mountainBike).getTipoDeAmortecedor());
	}

}
