package com.example.livro.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.livro.Entidade.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByTitulo(String titulo);

    boolean existsById(@SuppressWarnings("null") Long id);
}