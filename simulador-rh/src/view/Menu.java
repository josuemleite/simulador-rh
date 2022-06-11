package view;

import java.util.Scanner;

import model.Docente;

public class Menu {
	
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private float salarioBase;
	private Scanner in;
	

	public Menu() {
		in = new Scanner(System.in);
	}
	
	private void dadosFuncionario() {
		System.out.print("CPF: ");
		cpf = in.next();
		System.out.println();
		System.out.print("Nome: ");
		nome = in.next();
		System.out.println();
		System.out.print("Endereco: ");
		endereco = in.next();
		System.out.println();
		System.out.print("Data de admissao: ");
		dataAdmissao = in.next();
		System.out.println();
		System.out.print("Titulacao: ");
		titulacao = in.next();
		System.out.println();
		System.out.print("Salario base: ");
		salarioBase = in.nextFloat();
		System.out.println();
	}
	
	public Docente dadosDocente() {
		this.dadosFuncionario();
		System.out.print("Siape: ");
		String siape = in.next();
		System.out.println();
		System.out.print("Area: ");
		String area = in.next();
		System.out.println();
		
		Docente d = new Docente(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, siape, area);
		return d;
	}
	
	
	public int mainMenu() {
		System.out.println("*** Escolha uma opcao ***");
		System.out.println("[1] - Cadastrar um novo funcionario (Docente, Tecnico ou Terceiro)");
		System.out.println("[2] - Pesquisar por um funcionario e retornar todos os seus dados");
		System.out.println("[3] - Listar todos os funcionarios com todos os seus dados");
		System.out.println("[0] - Sair");
		int opcao = in.nextInt();
		return opcao;
	}
	
	public int menuFuncionario() {
		System.out.println("*** Informe o tipo de funcionario ***");
		System.out.println("[1] - Docente");
		System.out.println("[2] - Tecnico");
		System.out.println("[3] - Terceiro");
		System.out.println("[0] - Sair");
		int tipo = in.nextInt();
		return tipo;
	}
	
	public void close() {
		in.close();
	}
}
