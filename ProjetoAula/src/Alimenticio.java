import java.util.Date;

public class Alimenticio extends Produto{

    private Date dataFabricacao;
    private Date dataValidade;
    public double imposto;

    public Date getDataFabricacao(int i) {
        return dataFabricacao;
    }

   // public void setDataFabricacao(int dataFabricacao) {
   //     this.dataFabricacao = dataFabricacao;
   // }

    public Date getDataValidade() {
        return dataValidade;
    }

   // public void setDataValidade(int dataValidade) {
   //     this.dataValidade = dataValidade;
    //}

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calculoLucro(){
        double diferenca = precoVenda - precoCompra;
        double lucro = diferenca - (precoVenda * imposto);
        return lucro;
    }
}
