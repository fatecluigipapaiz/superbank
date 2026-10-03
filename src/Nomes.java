public class Nomes {
    private String nome;
    private String sobrenome;

    public Nomes(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
         return nome;
    } 

    public String getSobrenome() {
        return sobrenome;
    }

    
    
}
