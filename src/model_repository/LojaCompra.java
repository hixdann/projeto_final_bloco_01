package model_repository;

public class LojaCompra extends Loja{
	
	private String vitalicio;

	public LojaCompra(float fundos, int tipo, String jogo, String user, float compra, float depositar, float preco) {
		super(fundos, tipo, jogo, user, compra, depositar, preco);
		
	}

	public String getVitalicio() {
		return vitalicio;
	}

	public void setVitalicio(String vitalicio) {
		this.vitalicio = vitalicio;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("A sua compra é: " + this.vitalicio);
	}

}
