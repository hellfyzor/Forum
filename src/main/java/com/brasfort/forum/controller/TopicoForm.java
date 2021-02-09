package com.brasfort.forum.controller;

import com.brasfort.forum.modelo.Curso;
import com.brasfort.forum.modelo.Topico;
import com.brasfort.forum.repository.CursoRepository;
import com.sun.istack.NotNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Validated
public class TopicoForm {

    @NotNull
    @NotEmpty
    private String titulo;

    @NotNull @NotEmpty
    private String mensagem;

    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public TopicoForm setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }



    public String getMensagem() {
        return mensagem;
    }

    public TopicoForm setMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public TopicoForm setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        return this;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
