package executavel;

import classesetc.Servicos;
import daos.ServicoDAO;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        ServicoDAO dao = new ServicoDAO();
        List<Servicos> servico = dao.listarTudo();

        for(Servicos servicos : servico) {
            System.out.println("ID: " + servicos.getId());
            System.out.println("NOME: " + servicos.getNome());
            System.out.println("DESCRICAO: " + servicos.getDescricao());
            System.out.println("Valor: " + servicos.getValor());
            System.out.println ("============================================================");
        }
     }

    /*public static void main(String[] args) {

        ServicosDAO dao = new ServicoDAO();

        Servicos servicos = new Servicos();
        servicos.setNome("Sla");
        servicos.setDescricao("tanto faz");
        servicos.setValor(150.0);

        dao.inserir(servicos);
        consulta
    }

    */


    /*public static void main(String[] args) {

        ServicoDAO dao = new ServicoDAO();
        List<Servicos> servico = dao.listarTudo();

        for(Servicos servicos : servico) {
            System.out.println("ID: " + servicos.getId());
            System.out.println("NOME: " + servicos.getNome());
            System.out.println("DESCRICAO: " + servicos.getDescricao());
            System.out.println("Valor: " + servicos.getValor());
            System.out.println ("============================================================");
        }
    } */




}