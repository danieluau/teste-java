package classesetc;

import java.time.LocalDate;

public class RegistroServicos {
    private LocalDate data;
    private Servicos servicos;
    private Cliente cliente;
    private Funcionario funcionario;

    public RegistroServicos(LocalDate data, Servicos servicos, Cliente cliente, Funcionario funcionario) {
        this.data = data;
        this.servicos = servicos;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
