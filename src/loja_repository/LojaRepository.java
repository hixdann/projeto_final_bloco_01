package loja_repository;

import model_repository.Loja;

public interface LojaRepository {

	// CRUD da Conta
		public void procurarPorJogo(int numero);
		public void listarTodos();
		public void cadastrar(Loja loja);
		public void atualizar(Loja loja);
		public void deletar(int numero);
		
		// Comprando o jogo
		public void compra(int numero, float valor);
		public void depositar(int numero, float valor);
		
		
}
