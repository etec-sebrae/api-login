package br.etec.sebrae.login.dto;

import java.io.Serializable;

public class LoginDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String password;
	private String tipo;
	private String nome;
	
	public LoginDto() {		
	}

	public LoginDto(String login, String password, String tipo, String nome) {
		super();
		this.login = login;
		this.password = password;
		this.tipo = tipo;
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

}
