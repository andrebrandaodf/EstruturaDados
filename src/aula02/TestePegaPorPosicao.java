package aula02;

public class TestePegaPorPosicao {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Lucas");
		a2.setNome("André");
		a3.setNome("Rafael");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
		Aluno aluno3 = lista.pega(2);
	}
}
