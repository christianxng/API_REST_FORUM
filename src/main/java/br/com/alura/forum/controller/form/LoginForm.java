package br.com.alura.forum.controller.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

	@JsonProperty
	private String email;
	@JsonProperty
	private String senha;

	public LoginForm(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(email, senha);
	}

}
