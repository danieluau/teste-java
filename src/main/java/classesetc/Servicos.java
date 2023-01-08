package classesetc;


import java.time.LocalDate;



public class Servicos {
    private long id;
    private String nome;
    private String descricao;
    private double valor;


    public Servicos(long id, String nome, String descricao, double valor, LocalDate servico ,Funcionario funcionario) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.valor = valor;
    }

    public Servicos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor () {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

}
