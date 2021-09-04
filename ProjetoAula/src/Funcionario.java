import java.util.Date;

public class Funcionario extends Pessoa {
    public double salario;
    public Date dataAdmissao;
    public String cargo;

    public Funcionario(){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double settirarCopias(int qtd){
        return qtd * 0.10;
    }
}
