package org.example;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
         try {
             Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ifbeauty",
                     "postgres", "02082001@UaU");
             if (conexao != null) {
                 System.out.println("Banco de dados conectado com sucesso!");
                 Statement stm = conexao.createStatement();
                 consulta(stm);
             } else {
                 System.out.println("Conexão falhou!");
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

     static void consulta(Statement stm) {
         String sql = "select * from cliente";
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