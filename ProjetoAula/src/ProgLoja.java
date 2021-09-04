public class ProgLoja {
    public static void main(String[] args) {
        Alimenticio arroz = new Alimenticio();
        Livro biblia = new Livro();

        arroz.setCodigo("0010");
        arroz.setDescricao("Arroz Mascavo");

        arroz.setPrecoCompra(5.0);
        arroz.setPrecoVenda(15.0);
        arroz.setImposto(3.0);

        biblia.setPrecoCompra(10.0);
        biblia.setPrecoVenda(25.0);

        System.out.println(arroz.calculoLucro());
        System.out.println(biblia.calculoLucro());


    }
}
