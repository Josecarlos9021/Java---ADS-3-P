package com.example.livro.Entidade;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String Titulo;

    @Column(name = "Autor_principal", nullable = false, length = 150)
    private String autorPrincipal;
    
    @Column(name = "Ano_publicação", nullable = false)
    private Integer anoPublicacao;

    @Column(name = "Edição", nullable = false)
    private Integer edicao;

    @Column(name = "Data_criação", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "Data_alteração")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;
}
    