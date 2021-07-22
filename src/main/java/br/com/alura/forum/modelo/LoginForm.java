package br.com.alura.forum.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {


    @JsonProperty
    private String email;
    @JsonProperty
    private String senha;

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

    public UsernamePasswordAuthenticationToken retornaLogin() {
        return new UsernamePasswordAuthenticationToken(this.email,this.senha);
    }
}
