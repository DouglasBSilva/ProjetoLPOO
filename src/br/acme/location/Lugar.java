package br.acme.location;
import java.io.*;
@SuppressWarnings("serial")
public class Lugar implements Serializable {
	// Atributos ----------------------------------------------------------------------------------------------------
	private String identificadorLugar;
	private String endereco;
	
	// Construtor ----------------------------------------------------------------------------------------------------
	public Lugar(String identificadorLugar, String endereco) {
		this.identificadorLugar = identificadorLugar;
		this.endereco = endereco;
	}
	
	// Getters and Setters ----------------------------------------------------------------------------------------------------
	public String getIdentificadorLugar() {
		return identificadorLugar;
	}
	
	public void setIdentificadorLugar(String identificadorLugar) {
		this.identificadorLugar = identificadorLugar;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//m�todos---------------------------------------------------------------------------------------
	public String toString(){
		return "Identificador do Lugar: "+this.identificadorLugar+";Endere�o: "+this.endereco+";";
	}
}
