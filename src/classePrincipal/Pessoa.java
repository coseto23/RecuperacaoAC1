
package classePrincipal;
public class Pessoa {
    public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();       
    }
        private String nome; 
        private String endereco;
        private String bairro;
        private int cep;
        private String cidade;
        private String estado;
        //teste

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public int getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
}
