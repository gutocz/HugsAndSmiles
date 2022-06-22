package hugsandsmiles;

import java.util.Arrays;

public class Dog {
	private String nomeDog;
	private String nomeTutor;
	private String restricao;
	private int racao;
	
	public Dog (String nome, String tutor, int qtdRacao) {
		nomeDog = nome;
		nomeTutor = tutor;
		racao = qtdRacao;
	}
	
	public Dog (String nome, String tutor, int qtdRacao, String tipoRestricao) {
		nomeDog = nome;
		nomeTutor = tutor;
		racao = qtdRacao;
		restricao = tipoRestricao;
	}
	
	public String toString() {
		String [] dog = {"nome=" + nomeDog, "tutor=" + nomeTutor};
		return "Dog " + Arrays.toString(dog);
	}
	
	public void setNomeDog(String nome) {
		nomeDog = nome;
	}
	
	public void setTutor(String nome) {
		nomeTutor = nome;
	}
	
	public int getRacao() {
		return racao;
	}
}