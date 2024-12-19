package projeto_final_bloco_01;

import java.util.Scanner;

import cores.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND +
			"*******************************************************************");
			System.out.println("___________________________________________________________________");
			System.out.println("                                                                   ");
			System.out.println("            Bem-Vindo à Loja de Jogos:                             ");
			System.out.println("                                                                   ");
			System.out.println(" Selecione uma opção para continuar:                               ");
			System.out.println("                                                                   ");
			System.out.println(" 1 - Meu Cadastro                                                  ");
			System.out.println(" 2 - Criar Cadastro                                                ");
			System.out.println(" 3 - Catálogo de Jogos                                             ");
			System.out.println(" 4 - Comprar Jogos                                                 ");
			System.out.println(" 5 - Alugar Jogos                                                  ");
			System.out.println(" 6 - Adicionar Fundos à Conta                                      ");
			System.out.println(" 7 - Excluir Conta                                                 ");
			System.out.println(" 8 - Sair                                                          ");
			System.out.println("___________________________________________________________________");
			System.out.println("*******************************************************************" + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 8) {
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + "Muito obrigado pela visita, tenha uma ótima jogatina!");
				
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Meu Cadastro: ");
				
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Cadastro: ");
				
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Catálogo de Jogos: "); // AQUI É O INÍCIO DO QUE VOU TENTAR COLOCAR COMO LISTAGEM AUTOMÁTICA DEPOIS
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
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Comprar Jogos: ");
				
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Aluguel de Jogos: ");
				
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Minha Carteira: ");
				
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Excuir Conta: ");
				
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Por favor selecione uma Opção válida! ");
				break;
			
			}
			
		}

	}

}
