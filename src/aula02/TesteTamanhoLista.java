package aula02;

public class TesteTamanhoLista {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("André");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
				
		System.out.println(lista.tamanho());
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho());
	}
}
