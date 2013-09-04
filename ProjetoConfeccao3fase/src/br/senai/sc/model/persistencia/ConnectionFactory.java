package br.senai.sc.model.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wesley.s
 */
public class ConnectionFactory {

    public static Connection getConnection()
            throws SQLException {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconfeccao", "root", "");
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
    }
}