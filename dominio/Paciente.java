package dominio;

public class Paciente {
	
	private int id_paciente;
	private String nome_paciente;
	private double peso_paciente;
	private double altura_paciente;
	
	// c
	public Paciente(int id, String nome, double peso, double altura) {
		this.id_paciente = id;
		this.nome_paciente = nome;
		this.peso_paciente = peso;
		this.altura_paciente  = altura;
	}
	
	// Métodos get e set:
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	
	public String getNome_paciente() {
		return nome_paciente;
	}
	public void setNome_paciente(String nome_paciente) {
		this.nome_paciente = nome_paciente;
	}
	
	public double getPeso_paciente() {
		return peso_paciente;
	}
	public void setPeso_paciente(double peso_paciente) {
		this.peso_paciente = peso_paciente;
	}
	
	public double getAltura_paciente() {
		return altura_paciente;
	}
	public void setAltura_paciente(double altura_paciente) {
		this.altura_paciente = altura_paciente;
	}
	
	public void listarPacientes() {
		System.out.println("ID: " +id_paciente +" Nome: " +nome_paciente +" Peso: " +peso_paciente +" Altura: " +altura_paciente);
	}
	
}
