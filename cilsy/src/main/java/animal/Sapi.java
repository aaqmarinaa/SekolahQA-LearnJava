package animal;

public class Sapi extends Animal {
	public static void main (String[] args) {
		Animal sapi = new Animal();
		
		System.out.println("Sapi : ");
		sapi.nafas("Paru-paru");
		sapi.kulit("Berbulu");
		sapi.panjangBadan(300);
		sapi.beratBadan(11.5);
	}
}
