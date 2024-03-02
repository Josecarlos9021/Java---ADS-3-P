package pessoa;

public class Pessoa {
    
        //atributos
        String nome;
        String sobrenome;
        String dataNasc;
        String email;
        int telefone;
        
        //constantes
        public static final String cpf = "123.456.789-00"; //Já vi Arthur usar string no CPF, vou colocar, mas não tenho certeza.
        public static final String nacionalidade = "Brasileiro";
        
        public Pessoa(String nome, String sobrenome, String dataNasc, String email, int telefone) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.dataNasc = dataNasc;
            this.email = email;
            this.telefone = telefone;
        }
        
        public void Andar() {
            System.out.println(nome + " está andando.");
        }
        
        public void Comer() {
            System.out.println(nome + " Está comendo.");
        }
        
        public void Correr() {
            System.out.println(nome + " está correndo.");
        }
        
        public void Dormir() {
            System.out.println(nome + " está dormindo.");
        }
        
        public void PessoaValores() {
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            
            System.out.println("Informações contato: " + email +  " - " + dataNasc + " - " + telefone);
            
            System.out.println("Páis da nacionalidade: " + nacionalidade);
        }
}

            
    

