package br.com.pratica.profissional.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ContatoController {

    @GetMapping("/contato/nome")
    public String obterNome() {
        return String.format("José Carlos", HttpStatus.OK);
    }

    @GetMapping("/contato/telefone")
    public String obterTelefone() {
            return String.format("81 9 8282-8282", HttpStatus.OK);
        }
    @GetMapping("/contato/email")
    public String obterEmail() {
        return String.format("jose@gmail.com", HttpStatus.OK);
    }

    @PostMapping("/contato/post")
    public String cadastrarContato(@RequestBody String entity) {

        return String.format("Contato cadastrado com sucesso!",  HttpStatus.OK);
    }

    @DeleteMapping("/contato/delete")
    public String excluirContato(@PathVariable String telefone){
    
        return "Contato " + telefone + " excluído com sucesso!";
    }
}
    