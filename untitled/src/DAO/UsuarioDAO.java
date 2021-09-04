package DAO;

import Factory.ConnectionFactory;
import modelo.Usuario;

import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    private Connection connection;

    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES (?,?,?,?)";

        try {
            PreparedStatement add = connection.prepareStatement(sql);
            add.setString(1, usuario.getNome());
            add.setString(2, usuario.getCpf());
            add.setString(3, usuario.getEmail());
            add.setString(4, usuario.getTelefone());
            add.execute();
            add.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
