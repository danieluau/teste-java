package org.example;

import classesetc.Servicos;
import daos.ServicoDAO;
import daos.ServicosDAO;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        ServicosDAO dao = new ServicoDAO();

        Servicos servicos = new Servicos();
        servicos.setNome("Sla");
        servicos.setDescricao("tanto faz");
        servicos.setValor(150.0);

        dao.inserir(servicos);
        consulta
     }

     static void consulta() {
         String sql = "select * from servicos";
         try {
             ResultSet result = stm.executeQuery(sql);
             while (result.next()) {
                 System.out.println("id_cliente: " + result.getInt("id_cliente") + ", Nome: " + result.getString("nome") );
             }
         }catch (SQLException e) {
             e.printStackTrace();
         }
    }



}