package Factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testarConexao {
    public static void main(String[] args) throws SQLException {
        Connection connect = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!!!");
        connect.close();
    }
}
