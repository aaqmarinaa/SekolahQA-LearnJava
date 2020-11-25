package exerciseone;

public class Kendaraan {
	// definisi atribut
	String namaPemilik, brand, merk, status;
	int orangLain;
	
	void nyala() {
		if(status == "ON") {
			System.out.println("Mobil milik " +namaPemilik+ " dengan brand : " +brand+ " dan merk : " +merk+ " MENYALA.");
		} else if(status == "OFF") {
			System.out.println("Nyalakan mobilnya!");
		}
	}
	
	boolean bertemu() {
		if(orangLain > 0) return true;
		return false;
	}
}
