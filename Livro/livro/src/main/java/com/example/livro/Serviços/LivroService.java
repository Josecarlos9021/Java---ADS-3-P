package com.example.livro.Serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livro.Entidade.Livro;
import com.example.livro.Repositório.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;

    public Livro cadastrarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listarTodLivros() {
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarLivroID(Long id) {
        return livroRepository.findById(id);

    }

    public Optional<Livro> buscarLivroTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    
    }

    public Livro alterarLivro(long id, Livro livro) {
        return livroRepository.save(livro);
    }

    public void excluirLivro(long id) {
        livroRepository.deleteById(id);
    }

    public List<Livro> listarTodosLivros() {
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosLivros'");
    }

}
