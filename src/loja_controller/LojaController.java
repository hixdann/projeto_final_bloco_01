package loja_controller;

import java.util.ArrayList;

import loja_repository.LojaRepository;
import model_repository.Loja;

public class LojaController implements LojaRepository {

	private ArrayList<Loja> listaJogos = new ArrayList<Loja>();
	int numero = 0;

	@Override
	public void procurarPorJogo(int numero) {
		var loja = buscarNaCollection(numero);
		
		if (loja != null)
			loja.visualizar();
		else
			System.out.println("\nO jogo " + numero + " não foi encontrado!");

	}

	@Override
	public void listarTodos() {
		for (var loja : listaJogos) {
			loja.visualizar();
		}

	}

	@Override
	public void cadastrar(Loja loja) {
		listaJogos.add(loja);
		System.out.println("\nJogo adicionado");

	}

	@Override
	public void atualizar(Loja loja) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {

	}

	@Override
	public void compra(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Loja buscarNaCollection(int numero) {
		for (var loja : listaJogos) {
			if (loja.getNumero() == numero) {
				return loja;
			}
		}
		return null;
	}

}
