package view;

import persistence.GenericDAOMySQL;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main (String[] args) {
        GenericDAOMySQL mySQL = new GenericDAOMySQL();
        try {
            Connection c = mySQL.getConnection();
            String sgdbName = c.getMetaData().getDatabaseProductName();
            System.out.println(sgdbName);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
