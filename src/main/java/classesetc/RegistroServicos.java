package Classes.java;

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
}
