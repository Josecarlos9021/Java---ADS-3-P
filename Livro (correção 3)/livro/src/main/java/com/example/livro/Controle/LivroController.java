package com.example.livro.Controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.livro.Entidade.Livro;
import com.example.livro.Servicos.LivroService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/biblioteca/livro")
public class LivroController {
    
    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) throws Exception {
        return livroService.cadastrarLivro(livro);
    }

    @GetMapping("/listar-todos")
    public List<Livro> listarTodosLivros() {
        return livroService.listarTodosLivros();
    }
    
    @GetMapping("/livro/{idLivro}")
    public Optional<Livro> buscarLivroID(@PathVariable("idLivro") Long idLivro) {
        return Optional.empty(); // isso tá fazendo o que?
    }
    
     @GetMapping
     public ResponseEntity <List<Livro>> buscarLivroTitulo(@QueryParam("titulo") String titulo) {
       List<Livro> livrosEncontrados = livroService.buscarLivroTitulo(titulo);
         return ResponseEntity.ok().body(livrosEncontrados);
     }

    @PutMapping("/{idLivro}")
    public Livro alterarLivro(@PathVariable("idLivro") long idLivro, @RequestBody Livro livro) throws Exception {
        return livroService.alterarLivro(idLivro, livro);
    }

    @DeleteMapping("/{idLivro}")
    public void excluirLivro(@PathVariable("idLivro") Long idLivro) {
        livroService.excluirLivro(idLivro);
    }
}

