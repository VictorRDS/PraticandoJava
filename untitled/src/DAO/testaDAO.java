package DAO;

import modelo.Usuario;

public class testaDAO {
    public static void main(String[] args) {
        Usuario adicao = new Usuario();
        adicao.setNome("Victor Rodrigues");
        adicao.setCpf("387.895.535-80");
        adicao.setEmail("victorrodrigues1331@hotmail.com");
        adicao.setTelefone("+55 (11) 96208-3298 ");

        UsuarioDAO dao = new UsuarioDAO();

        dao.adiciona(adicao);

        System.out.println("Gravado!");
    }
}
