public class Professor extends Pessoa {
    public double salario;
    public String disciplina;

   public Professor(){

   }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double settirarCopias(int qtd){
        return qtd * 0.010;
    }
}
