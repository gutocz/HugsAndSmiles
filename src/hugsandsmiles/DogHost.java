package hugsandsmiles;

import java.util.ArrayList;

public class DogHost {
	private int maxDogs;
	private int maxRacao;
	private int countDogs = 0;
	private String anfitriao;
	private String dogLista = "";
	private int racaoDiario;
	private ArrayList<String> dogs = new ArrayList();
	
	public DogHost (int maxDogs, int maxRacao, String nome) {
		this.maxDogs = maxDogs;
		this.maxRacao = maxRacao;
		anfitriao = nome;
	}
	
	public boolean adicionaDog(String nome, String tutor, int qtdRacao) {
		racaoDiario += qtdRacao;
		if (countDogs >= maxDogs || racaoDiario > maxRacao) {
			racaoDiario -= qtdRacao;
			return false;
		} else {
			Dog dog = new Dog(nome, tutor, qtdRacao);
			dogs.add(dog.toString());
			countDogs ++;
			return true;
		}
	}
	
	public boolean adicionaDog(String nome, String tutor, int qtdRacao, String tipoRestricao) {
		qtdRacao = qtdRacao * 2;
		racaoDiario += qtdRacao;
		if (countDogs >= maxDogs || racaoDiario > maxRacao) {
			racaoDiario -= qtdRacao;
			return false;
		} else {
			Dog dog = new Dog(nome, tutor, qtdRacao, tipoRestricao);
			dogs.add(dog.toString());
			racaoDiario += qtdRacao;
			countDogs ++;
			return true;
		}
	}
	
	public String formatadorLista() {
		for (int i = 0; i < dogs.size(); i++) {
			dogLista += dogs.get(i) + "\n";
		}
		return dogLista;
	}
	public String listaDogs() {
		return anfitriao + ":" + "\n" + formatadorLista();
	}
	
	public boolean verificadorDogHost(Dog toto) {
		int count = 0;
		for (int i = 0; i < dogs.size(); i++) {
			if (toto.toString() == dogs.get(i)) {
				count ++;
			}
		}
		if (count >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public double consultaValorHospedagem(Dog toto, int dias) {
		double diaria = toto.getRacao() * 0.4;
		double valor = diaria * dias;
		if (verificadorDogHost(toto) == true) {
			return valor;
		} else {
			return Double.parseDouble("IllegalArgumentException");
		}
	}
	
	public int totalRacaoDiario() {
		return racaoDiario;
	}
	
	public Double totalDiarias() {
		double diaria = racaoDiario * 0.4;
		return diaria;
	}
}
