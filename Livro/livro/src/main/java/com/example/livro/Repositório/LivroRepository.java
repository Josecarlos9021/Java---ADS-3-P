package com.example.livro.Repositório;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.livro.Entidade.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Optional<Livro> findByTitulo(String titulo);
}