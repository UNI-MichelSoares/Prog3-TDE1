package controle;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Paciente;

public class ControlaPaciente {
	
	private ArrayList<Paciente> pacientes;
	
	public ControlaPaciente() {
		this.pacientes = new ArrayList<>();
	}
	
	public void cadastrarPaciente(int id, String nome, double peso, double altura) {
		Paciente paciente = new Paciente(id, nome, peso, altura);
		pacientes.add(paciente);
		System.out.println("Paciente cadastrado com sucesso!");
	}
	
	public void editarPaciente(int id) {
		Paciente paciente = buscarPacientePorId(id);
		if (paciente != null) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Novo nome:");
			String novoNome = scanner.nextLine();
			System.out.print("Novo peso:");
			double novoPeso = scanner.nextDouble();
			System.out.print("Nova altura:");
			double novaAltura = scanner.nextDouble();
			
			paciente.setNome_paciente(novoNome);
			paciente.setPeso_paciente(novoPeso);
			paciente.setAltura_paciente(novaAltura);
			
			System.out.println("Paciente editado com sucesso!");
		}
		else {
			System.out.println("Paciente de ID:" +id +" não encontrado!");
		}
	}
	
	public void excluirPaciente(int id) {
		Paciente paciente = buscarPacientePorId(id);
		if (paciente != null) {
			pacientes.remove(paciente);
			System.out.println("Paciente excluido com sucesso!");
		} 
		else {
			System.out.println("Paciente de ID: " +id +" não encontrado.");
		}
	}
	
	public void exibirPacientes() {
		if (pacientes.isEmpty()) {
			System.out.println("Nenhum paciente encontrado.");
		}
		else {
			System.out.println("Lista de pacientes: ");
			for (Paciente paciente : pacientes) {
				paciente.listarPacientes();
			}
		}
	}
	
	public Paciente buscarPacientePorId(int id) {
		for (Paciente paciente : pacientes) {
			if (paciente.getId_paciente() == id) {
				return paciente;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		ControlaPaciente controle = new ControlaPaciente();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\nMenu:");
            System.out.println("1. Adicionar paciente");
            System.out.println("2. Exibir paciente");
            System.out.println("3. Editar paciente");
            System.out.println("4. Excluir paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
            	System.out.print("ID do paciente: ");
            	int id = scanner.nextInt();
            	scanner.nextLine();
            	
            	System.out.print("Nome do paciente: ");
            	String nome = scanner.nextLine();
            	
            	System.out.print("Peso do paciente: ");
            	double peso = scanner.nextDouble();
            	
            	System.out.print("Altura do paciente: ");
            	double altura = scanner.nextDouble();
            	
            	controle.cadastrarPaciente(id, nome, peso, altura);
            	break;
            case 2:
            	controle.exibirPacientes();
            	break;
            case 3:
            	System.out.print("ID do paciente: ");
            	int idAlterar = scanner.nextInt();
            	scanner.nextLine();
            	controle.editarPaciente(idAlterar);
            	break;
            case 4:
            	System.out.print("ID do paciente: ");
            	int idExcluir = scanner.nextInt();
            	controle.excluirPaciente(idExcluir);
            	break;
            case 0:
            	System.out.println("Encerrando o programa.");
            default:
            	System.out.println("Opção inválida.");
            }
            
		} while (opcao != 0);
		
		scanner.close();
	}
	
}
