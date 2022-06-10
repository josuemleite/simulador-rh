package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("[1] - Cadastrar um novo funcionario (Docente, Tecnico ou Terceiro)");
			System.out.println("[2] - Pesquisar por um funcionario e retornar todos os seus dados");
			System.out.println("[3] - Listar todos os funcionarios com todos os seus dados");
			System.out.println("[0] - Sair");
			opcao = in.nextInt();
		} while (opcao != 0);

		in.close();
	}

}
