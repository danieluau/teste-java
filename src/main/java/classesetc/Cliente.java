package classesetc;



public class Cliente {
    private long id;
    private String nome;
    private String email;
    private String sexo;
    private Endereco endereco;
    
    
    public Cliente(long id, String nome, String email, String sexo, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.endereco =endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setEnderecoNumero(String numero){
        this.endereco.setNumero(numero);
    }
    public void setEnderecoBairro(String nome){
        this.endereco.setBairro(nome);
    }
    public void setEnderecoCidade(String cidade){
        this.endereco.setBairro(cidade);
    }
    public void setEnderecoLogradouro(String logradouro){
        this.endereco.setLogradouro(logradouro);
    }
    public void setEnderecoUf(String uf){
        this.endereco.setUf(uf);
    }


}
