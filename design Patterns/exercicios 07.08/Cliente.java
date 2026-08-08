public class Cliente {

    String nome;
    String sobrenome;
    String email;
    String telefone;
    String endereco;
    String cpf;
    String nascimento;
    String cidade;
    String estado;
    String cep;
    String pais;

    public Cliente(String nome, String sobrenome, String email,
                   String telefone, String endereco, String cpf,
                   String nascimento, String cidade, String estado,
                   String cep, String pais) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = pais;
    }
}