package br.acme.users;

public class Gerente extends Usuario {
	// Atributos ----------------------------------------------------------------------------------------------------
		//Todos os atributos est�o na superClasse
	
	// Construtor ----------------------------------------------------------------------------------------------------
	public Gerente(String cpf, String nome, String senha, String email, String sexo){
		// Construtor da superClasse
		super(cpf,nome,senha,email,sexo);
	}

	// Getters and Setters ----------------------------------------------------------------------------------------------------
		// Getters and Setters est�o na superClasse

	// M�todos ----------------------------------------------------------------------------------------------------
	public void cadastrarMotorista(Motorista newbie){
		
	}
	
	public void removerMotorista(long id){
		
	}
	
	public void listarMotoristas(){
		
	}
	
	public void listarClientes(){
		
	}
	public String toString(){
		return super.toString();
	}
	
}
