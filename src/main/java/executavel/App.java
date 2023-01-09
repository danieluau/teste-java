package executavel;

import classesetc.Servicos;
import daos.ServicoDAO;


import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {

        ServicoDAO dao = new ServicoDAO();
        Optional<Servicos> servicosOptional = dao.listarPorID(2);
        servicosOptional.ifPresent(servicos -> {
            System.out.println("ID: " + servicos.getId());
            System.out.println("NOME: " + servicos.getNome());
            System.out.println("DESCRICAO: " + servicos.getDescricao());
            System.out.println("Valor: " + servicos.getValor());
            System.out.println("============================================================");
        });


    /*public static void inserir(String[] args) {

        ServicosDAO dao = new ServicoDAO();

        Servicos servicos = new Servicos();
        servicos.setNome("Sla");
        servicos.setDescricao("tanto faz");
        servicos.setValor(150.0);

        dao.inserir(servicos);
        consulta
    }

    */


    /*public static void listartodos(String[] args) {
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

        /*public static void main(String[] args) {

            ServicoDAO dao = new ServicoDAO();
            Optional<Servicos> servicosOptional = dao.listarPorID(2);
            servicosOptional.ifPresent(servicos -> {
                System.out.println("ID: " + servicos.getId());
                System.out.println("NOME: " + servicos.getNome());
                System.out.println("DESCRICAO: " + servicos.getDescricao());
                System.out.println("Valor: " + servicos.getValor());
                System.out.println("============================================================");
            });
        */

    }
}