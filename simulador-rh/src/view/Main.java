package view;

import model.Docente;

public class Main {

	public static void main(String[] args) {

		int opcao;
		int tipo;

		Menu menu = new Menu();
		
		do {
			
			opcao = menu.mainMenu();
			switch (opcao) {
			case 1: {
				
				tipo = menu.menuFuncionario();
				switch (tipo) {
				case 1: {
					Docente d = menu.dadosDocente();
					System.out.println(d.calculaSalario());
				}
					break;
				case 2: {
				}
					break;
				case 3: {

				}
					break;
				case 0: {

				}
					break;
				default: {
					System.out.println("Opcao invalida");
				}
					break;
				}
			}
				break;
			case 2: {

			}
				break;
			case 3: {

			}
				break;
			case 0: {

			}
				break;
			default: {
				System.out.println("Opcao invalida");
			}
				break;
			}
		} while (opcao != 0);
		
		menu.close();
	}
}
