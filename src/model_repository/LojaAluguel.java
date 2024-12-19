package model_repository;

public class LojaAluguel extends Loja{
	
	private int prazo;

	public LojaAluguel(float fundos, int tipo, String jogo, String user, float compra, float depositar, float preco, int prazo) {
		super(fundos, tipo, jogo, user, compra, depositar, preco);
		this.prazo = prazo;
		
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	
	public void prazo (int tipo) {
		
		if (tipo == 2) {
			System.out.println("O tempo com o seu jogo é de " + prazo);
		}
		else if(tipo == 1) {
			System.out.println("Compra vitalícia realizada com Sucesso.");
		}
		else {
			System.out.println("Compra não realizada, verifique os dados novamente.");
			
		}
		
	}

}
