package com.example.livro.Servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.livro.Entidade.Livro;
import com.example.livro.Repositorio.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;

    public Livro cadastrarLivro(Livro livro) {
        try {
            return livroRepository.save(livro);
        } catch(Exception exception) {
            throw exception;
        }
    }

    public List<Livro> listarTodLivros() {
        try {
        return livroRepository.findAll();
    } 
        catch (Exception exception) {
        exception.printStackTrace();
        throw exception;
    }
    }

    public ResponseEntity<Livro> buscarLivroID(Long idLivro) {
        try {
        Optional<Livro> livOptional = livroRepository.findById(idLivro);
        return livOptional.map(livro -> ResponseEntity.ok().body(livro)).orElse(ResponseEntity.notFound().build());
    }   
        catch (Exception exception) {
        exception.printStackTrace();
        return null;
    }
    }

    public List<Livro> buscarLivroTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    
    }

    public Livro alterarLivro(Long idLivro, Livro livro) throws Exception {
        try {
        if (!livroRepository.existsById(idLivro)) {
            throw new NotFoundException();
        }
        if (validarCamposObrigatorios(livro)) {
            livro.setID(idLivro);
            livro = livroRepository.save(livro);
        }
        } catch (Exception e) {
        throw e;
        }
        return livro;
    }

    private boolean validarCamposObrigatorios(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarCamposObrigatorios'");
    }

    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public List<Livro> listarTodosLivros() {
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosLivros'");
    }
}
