public class Livro extends Produto {
    private String ISBN;


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double calculoLucro() {
        double diferenca = precoVenda - precoCompra;
        return diferenca;
    }


}
