package model_repository;

public abstract class Loja {

	private float fundos;
	private int tipo; // Esse tipo é se vai ser aluguel ou compra;
	private String jogo;
	private String user;
	private float compra;
	private float depositar;
	private float preco;
	private int numero;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Loja(float fundos, int tipo, String jogo, String user, float compra, float depositar, float preco) {
		super();
		this.fundos = fundos;
		this.tipo = tipo;
		this.jogo = jogo;
		this.user = user;
		this.compra = compra;
		this.depositar = depositar;
	}

	public float getFundos() {
		return fundos;
	}

	public void setFundos(float fundos) {
		this.fundos = fundos;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public float getCompra() {
		return compra;
	}

	public void setCompra(float compra) {
		this.compra = compra;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getDepositar() {
		return depositar;
	}

	public void setDepositar(float depositar) {
		this.depositar = depositar;
	}


	public boolean compra(float valor) {

		if (this.getFundos() < valor) {
			System.out.println("\n Fundos Insuficientes");
			return false;
		}

		this.setFundos(this.getFundos() - valor); // Vai colocar o valor no atributo fundos o valor que ele tinha nos
													// fundos menos o valor da compra
		return true;
	}

	public void depositar(float valor) {

		this.setFundos(this.getFundos() + valor); // Vai colocar o valor no atributo fundos o valor que ele tinha nos
													// fundos mais o valor que ele quer colocar

	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Alugar";
			break;
		case 2:
			tipo = "Comprar";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Meu Cadastro:");
		System.out.println("***********************************************************");
		System.out.println("Usuário: " + this.user);
		System.out.println("Fundos: " + this.fundos);
		System.out.println("Produto que deseja " + tipo + ": " + this.jogo);
		System.out.println("Valor do Produto: " + preco);

	}

}
