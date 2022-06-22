package hugsandsmiles;

public class Main {

	public static void main(String[] args) {
		DogHost teste = new DogHost(3, 10, "Gustavo");
		teste.adicionaDog("Bidu", "Paulo", 6);
		teste.adicionaDog("Tony", "Paulo", 6);
		teste.adicionaDog("rex", "Paulo", 4);
		teste.adicionaDog("albert", "Paulo", 5);
		System.out.println(teste.listaDogs());
		System.out.println(teste.totalDiarias());
	}

}
