package com.example.livro.Controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.livro.Entidade.Livro;
import com.example.livro.Serviços.LivroService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/biblioteca/livro")
public class LivroController {
    
    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return livroService.cadastrarLivro(livro);
    }

    @GetMapping("/listar-todos")
    public List<Livro> listarTodosLivros() {
        return livroService.listarTodosLivros();
    }
    
    @GetMapping("/{idLivro}")
    public Optional<Livro> buscarLivroID(@PathVariable Long idLivro) {
        return livroService.buscarLivroID(idLivro);
    }
    
    @GetMapping
    public Optional<Livro> buscarLivroTitulo(@RequestParam String titulo) {
        return livroService.buscarLivroTitulo(titulo);
    }

    @PutMapping("/{idLivro}")
    public Livro alterarLivro(@PathVariable long idLivro, @RequestBody Livro livro) {
        return livroService.alterarLivro(idLivro, livro);
    }

    @DeleteMapping("/{idLivro}")
    public void excluirLivro(@PathVariable Long idLivro) {
        livroService.excluirLivro(idLivro);
    }
}

