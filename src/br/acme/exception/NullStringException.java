package br.acme.exception;

@SuppressWarnings("serial")
public class NullStringException extends UsersExceptions {
	
	public NullStringException(String msg) {
		super(msg+" n�o pode ser vazio.");
	}
}
