package entities;

public class Pessoa {

	private String nome;
	private String funcaoCasa;
	private int idade;
	private double peso;
	private double altura;
	private double inicioTrabalho;
	private double fimTrabalho;
	
	public Pessoa(String nome, String funcaoCasa, int idade, double peso, double altura, double inicioTrabalho,
			double fimTrabalho) {
		this.nome = nome;
		this.funcaoCasa = funcaoCasa;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.inicioTrabalho = inicioTrabalho;
		this.fimTrabalho = fimTrabalho;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncaoCasa() {
		return funcaoCasa;
	}

	public void setFuncaoCasa(String funcaoCasa) {
		this.funcaoCasa = funcaoCasa;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getInicioTrabalho() {
		return inicioTrabalho;
	}

	public void setInicioTrabalho(double inicioTrabalho) {
		this.inicioTrabalho = inicioTrabalho;
	}

	public double getFimTrabalho() {
		return fimTrabalho;
	}

	public void setFimTrabalho(double fimTrabalho) {
		this.fimTrabalho = fimTrabalho;
	}

	public double horasTrabalhadas() {
		if (fimTrabalho >= inicioTrabalho) {
			return fimTrabalho - inicioTrabalho;
		} else {
			return (24 - inicioTrabalho) + fimTrabalho;
		}
	}
}
