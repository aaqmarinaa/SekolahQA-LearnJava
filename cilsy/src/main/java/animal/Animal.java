package animal;

public class Animal {
	int panjangBadan;
	double beratBadan;
	String nafas, kulit;
	
	void panjangBadan(int panjang) {
		System.out.println("Panjang : " + panjang + "cm.");
	}
	
	void beratBadan(double berat) {
		System.out.println("Berat : " + berat + "kg.");
	}
	
	void nafas(String pernafasan) {
		System.out.println("Alat pernafasan : " + pernafasan);
	}

	void kulit(String kulit) {
		System.out.println("Tekstur kulit : " + kulit);
	}
}
