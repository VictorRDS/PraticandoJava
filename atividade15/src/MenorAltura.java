
import java.util.Scanner;

public class MenorAltura {
    public static void main(String[] args){
        double altura, MenorAltura, contador;
        String nome, MenorNome;

        MenorAltura = 99;
        contador = 0;
        MenorNome = "";
        Scanner entrada = new Scanner(System.in);


        do {
            System.out.println("receba nome: ");
            nome = entrada.next();
            System.out.println("receba altura: ");
            altura = entrada.nextDouble();
            if (altura < MenorAltura) {
                MenorAltura = altura;
                MenorNome = nome;
            }
            contador++;
        } while (contador < 10);

        entrada.close();
        System.out.println("Menor altura: "+ MenorAltura);
        System.out.println("Nome: "+ MenorNome);
    }
}