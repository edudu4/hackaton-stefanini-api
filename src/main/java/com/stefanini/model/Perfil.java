package com.stefanini.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_seq_perfil")
    private Long id;
    /**
     *
     */
    @NotNull
    @Column(name = "no_perfil")
    private String nome;
    /**
     *
     */
    @NotNull
    @Column(name = "ds_perfil")
    private String descricao;
    /**
     *
     */
    @Column(name = "dt_hora_inclusao")
    @NotNull
    private LocalDateTime dataHoraInclusao;
    /**
     *
     */
    @Column(name = "dt_hora_alteracao")
    private LocalDateTime dataHoraAlteracao;

//    /**
//     * Mapeamento de Pessoa
//     */
    @ManyToMany(mappedBy = "perfils")
    private Set<Pessoa> pessoas;


    public Perfil() {
    }

    public Perfil(Long id) {
        this.id = id;
    }

    public Perfil(@NotNull String nome, @NotNull String descricao, @NotNull LocalDateTime dataHoraInclusao, LocalDateTime dataHoraAlteracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataHoraInclusao = dataHoraInclusao;
        this.dataHoraAlteracao = dataHoraAlteracao;
 //       this.pessoas = pessoas;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHoraInclusao() {
        return dataHoraInclusao;
    }

    public void setDataHoraInclusao(LocalDateTime dataHoraInclusao) {
        this.dataHoraInclusao = dataHoraInclusao;
    }

    public LocalDateTime getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
        this.dataHoraAlteracao = dataHoraAlteracao;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataHoraInclusao=" + dataHoraInclusao +
                ", dataHoraAlteracao=" + dataHoraAlteracao +
//                ", pessoas=" + pessoas +
                '}';
    }
}
