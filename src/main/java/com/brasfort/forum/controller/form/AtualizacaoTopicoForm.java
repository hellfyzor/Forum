package com.brasfort.forum.controller.form;

import com.brasfort.forum.modelo.Topico;
import com.brasfort.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class AtualizacaoTopicoForm {

    @NotNull
    @NotEmpty
    private String titulo;

    @NotNull @NotEmpty
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public AtualizacaoTopicoForm setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getMensagem() {
        return mensagem;
    }

    public AtualizacaoTopicoForm setMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {

        Topico topico = topicoRepository.getOne(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
