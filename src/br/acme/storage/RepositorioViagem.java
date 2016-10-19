package br.acme.storage;

import java.util.ArrayList;

import br.acme.location.Viagem;

public class RepositorioViagem {
	// Atributos ----------------------------------------------------------------------------------------------------
	private ArrayList<Viagem> listaViagem = new ArrayList<Viagem>();
	
	// Construtor Padr�o
	
	// Getters and Setters ----------------------------------------------------------------------------------------------------
	public ArrayList<Viagem> getListaViagem() {
		return listaViagem;
	}

	public void setListaViagem(ArrayList<Viagem> listaViagem) {
		this.listaViagem = listaViagem;
	}
	
	// M�todos ----------------------------------------------------------------------------------------------------
	public void adicionar(Viagem novoViagem){
		listaViagem.add(novoViagem);
	}
	
	public void remover(long id){
		boolean removido = false; // Vari�vel booleana que varia de acordo com o sucesso do m�todo
		for(Viagem element: listaViagem){
			if(element.getId() == id){
				listaViagem.remove(element);
				removido=true;
			}
		}
		if(removido)
			System.out.println("Viagem removida com sucesso.");
		else
			System.out.println("Viagem n�o encontrada.");
	}
	
	public Viagem buscar(long id){
		for(Viagem element : listaViagem){
			if(element.getId() == id){
				return element;
			}
		}
		return null;
	}
	
	public ArrayList<Viagem> buscarTodos(){
		return this.getListaViagem();
	}
}
