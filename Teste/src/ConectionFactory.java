package com.mycompany.agroa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;

public class ConectionFactory {

    private String usuario = "root";
    private String senha = "anima123";
    private String host = "localhost";
    private String porta = "3306";
    private String db = "a3";
    private String timezone = "America/Sao_Paulo";
    
    public Connection obtemConexão() {

        try {
            String url = "jdbc:mysql://" + host + ":" + porta + "/" + db +"?serverTimezone=" + timezone;
            Connection conectar = DriverManager.getConnection(url, usuario, senha);
           /*
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db, usuario, senha);
          */
            if (conectar != null) {
                System.out.println("Conexão estabelecida com sucesso");
            }
            return conectar;
        } catch (SQLException e) {
            System.out.println("Erro ao tentar estabelecer conexão com o banco de dados");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ConectionFactory connectionFactory = new ConectionFactory();
        Connection connection = connectionFactory.obtemConexão();

        if (connection != null) {
            System.out.println("conexão aprovada");
        } else {
            System.out.println("erro na conexão");
        }
    }

    Connection obtemConexao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
