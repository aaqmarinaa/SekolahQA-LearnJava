package exerciseone;

public class Person {
	public static void main(String[] args){
		Kendaraan mobil = new Kendaraan();
		
		mobil.status = "OFF";
		mobil.namaPemilik = "Galileo";
		mobil.brand = "Ford";
		mobil.merk = "Mustang";
		mobil.orangLain = 1;
		
		mobil.nyala();
		if(mobil.status == "ON") {
			if(mobil.bertemu()) {
				System.out.println("");
				System.out.println("Ada orang.");
				System.out.println("Tuutt Tuutt!!");
			}
		}
	}
}
