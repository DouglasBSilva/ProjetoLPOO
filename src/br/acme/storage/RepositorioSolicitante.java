	package br.acme.storage;
import br.acme.users.Solicitante;
import java.util.ArrayList;

public class RepositorioSolicitante {
	// Atributos ----------------------------------------------------------------------------------------------------
	private ArrayList<Solicitante> listaSolicitante = new ArrayList<Solicitante>();

	// Getters and Setters ----------------------------------------------------------------------------------------------------
	public ArrayList<Solicitante> getListaSolicitante() {
		return listaSolicitante;
	}

	public void setListaSolicitante(ArrayList<Solicitante> listaSolicitante) {
		this.listaSolicitante = listaSolicitante;
	}
	
	// M�todos ----------------------------------------------------------------------------------------------------
	public void adicionar(Solicitante novoSolicitante){
		listaSolicitante.add(novoSolicitante);
	}
	
	public void remover(long id){
		boolean removido = false; // Vari�vel booleana que varia de acordo com o sucesso do m�todo
		for(Solicitante user: listaSolicitante){
			if(user.getId() == id){
				listaSolicitante.remove(user);
				removido=true;
			}
		}
		if(removido)
			System.out.println("Solicitante removido com sucesso.");
		else
			System.out.println("Solicitante n�o encontrado.");
	}
	
	public void alterar(long id, Solicitante altUser){
		boolean alterado = false; //Vari�vel booleana que varia de acordo com o sucesso do m�todo
		int i = 0; // �ndice do elemento no ArrayList
		// Percorre o ArrayList alterando o �ndice at� encontrar o elemento desejado
		for(Solicitante user: listaSolicitante){
			if(user.getId() == id){
				listaSolicitante.set(i, altUser);
				alterado=true;
			}
			i++;
		}
		if(alterado)
			System.out.println("Solicitante alterado com sucesso.");
		else
			System.out.println("Solicitante n�o encontrado.");
	}
	
	public Solicitante buscar(long id){
		for(Solicitante user : listaSolicitante){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	
	public ArrayList<Solicitante> buscarTodos(){
		return this.getListaSolicitante();
	}
}
