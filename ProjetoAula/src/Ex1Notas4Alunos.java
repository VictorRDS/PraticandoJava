import java.util.Scanner;

public class Ex1Notas4Alunos {
    double[] notas = new double[4];

    public Ex1Notas4Alunos() {
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    Ex1Notas4Alunos n = new Ex1Notas4Alunos();

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i;
        for (i=1; i < 5; i++){
           double nota = entrada.nextInt();
           System.out.println(" Nota "+i +"\t = " +nota);
        }
        entrada.close();

    }
}
