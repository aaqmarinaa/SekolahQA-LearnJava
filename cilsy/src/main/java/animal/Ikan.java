package animal;

public class Ikan extends Animal {
	public static void main (String[] args) {
		Animal ikan = new Animal();
		
		System.out.println("Ikan : ");
		ikan.nafas("Insang");
		ikan.kulit("Bersisik");
		ikan.panjangBadan(15);
		ikan.beratBadan(0.8);
	}
}