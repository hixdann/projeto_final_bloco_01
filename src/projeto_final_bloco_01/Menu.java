package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import model_repository.Loja;
import cores.Cores;
import loja_controller.LojaController;
import model_repository.LojaAluguel;
import model_repository.LojaCompra;

public class Menu {

	public static void main(String[] args) {
		
		LojaController jogos = new LojaController();
		
		Scanner leia = new Scanner(System.in);
		
		
		int opcao, tipo;
		String jogo, user;
		
		while (true) {
			
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND +
			"*******************************************************************");
			System.out.println("___________________________________________________________________");
			System.out.println("                                                                   ");
			System.out.println("            Bem-Vindo à Loja de Jogos:                             ");
			System.out.println("                                                                   ");
			System.out.println(" Selecione uma opção para continuar:                               ");
			System.out.println("                                                                   ");
			System.out.println(" 1 - Meu Cadastro             OPÇÃO EM DESENVOLVIMENTO             ");
			System.out.println(" 2 - Criar Cadastro           OPÇÃO EM DESENVOLVIMENTO             ");
			System.out.println(" 3 - Catálogo de Jogos                                             ");
			System.out.println(" 4 - Comprar Jogos                                                 ");
			System.out.println(" 5 - Alugar Jogos             OPÇÃO EM DESENVOLVIMENTO             ");
			System.out.println(" 6 - Adicionar Fundos à Conta OPÇÃO EM DESENVOLVIMENTO             ");
			System.out.println(" 7 - Excluir Conta                                                 ");
			System.out.println(" 8 - Sair                                                          ");
			System.out.println("___________________________________________________________________");
			System.out.println("*******************************************************************" + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();				
			}catch (InputMismatchException e) {
				System.out.println("\n Digite valores inteiros");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 8) {
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Muito obrigado pela visita, tenha uma ótima jogatina!");
				
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Meu Cadastro: ");
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Realizar Pedido: ");
				
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite seu nome: ");
				leia.skip("\\R");
				user = leia.nextLine();
				
				
				do {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Digite [1] para Alugar ou [2] para Comprar Jogos: ");
					tipo = leia.nextInt();
				}while (tipo < 1 && tipo > 2);
				
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite qual jogo você quer comprar: ");
				jogo = leia.nextLine();
				
				
				
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Catálogo de Jogos: "); // AQUI É O INÍCIO DO QUE VOU TENTAR COLOCAR COMO LISTAGEM AUTOMÁTICA DEPOIS
				
				jogos.listarTodos();
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Pokémo Arceus - Aluguel: 15,00 R$(Mês) Compra: 280,00 R$           ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Pokémo Scarlet/ Violet - Aluguel: 18,00 R$(Mês) Compra: 300,00 R$  ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Super Mario Odissey - Aluguel: 12,00 R$(Mês) Compra: 250,00 R$     ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Super Mario Maker 2 - Aluguel: 14,00 R$(Mês) Compra: 270,00 R$     ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "The Legend of Zelda BOW - Aluguel: 15,00 R$(Mês) Compra: 280,00 R$ ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Mario Kart 8 - Aluguel: 10,00 R$(Mês) Compra: 220,00 R$            ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "                                                                   ");
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Comprar Jogos: ");
				
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o número do Jogo para verificarmos os Preços: ");
				int numero = leia.nextInt();
				
				jogos.procurarPorJogo(numero);
				
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Aluguel de Jogos: ");
				
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Minha Carteira: ");
				
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Realizar compra do jogo fazendo assim a exclusão dele de nosso estoque: ");
				
				System.out.println(Cores.TEXT_WHITE_BOLD + "Digite o número do Jogo ");
				numero = leia.nextInt();
				
				jogos.deletar(numero);
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Por favor selecione uma Opção válida! ");
				keyPress();
				break;
			
			}
			
		}

	}
	
	public static void keyPress( ) {
		
		try {
			
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "\nPressione a tecla \"ENTER\"" + " para continuar!                          ");
			System.in.read();
		}catch (IOException e) {
			
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + " Você pressionou uma tecla diferente de \"ENTER\"                           ");
		}
	}

}
