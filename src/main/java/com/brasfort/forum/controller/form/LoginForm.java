package com.brasfort.forum.controller.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LoginForm setEmail(String email) {
        this.email = email;
        return this;
    }

    public LoginForm setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public UsernamePasswordAuthenticationToken converter() {

        return new UsernamePasswordAuthenticationToken(email, senha);
    }
}
