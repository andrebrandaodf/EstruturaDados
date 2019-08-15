package aula02;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];

	int totalDeAlunos = 0;

	public void adiciona1(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}

	public void adiciona(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append(" ]");
		return builder.toString();
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}

	public Aluno pega(int posicao) {
		if (this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.alunos[posicao];
	}

	public void adiciona(int posicao, Aluno aluno) {

	}

	private boolean posicaoOcupado(int posicao) {
		throw new UnsupportedOperationException("Not supported yet.");
		// To change body of generated methods, choose Tool | Templates.
	}
}
