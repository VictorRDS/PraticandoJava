import java.util.Scanner;

public class ProgCopias {
    public static void main(String[] args) {
        Aluno mario = new Aluno();
        Professor jose = new Professor();
        Funcionario maria = new Funcionario();





        System.out.println("---------------------------");
        System.out.println("Seja bem vindo a copiadora!!");
        System.out.println("---------------------------");

        System.out.printf("Vocé é: 1-Aluno / 2-Professor / 3-Funcionário ? Obs: Qualquer outra resposta diferente de 1 a 3 dará error.");
        int cond;
        Scanner entrada = new Scanner(System.in);
        cond = entrada.nextInt();

        if (cond == 1) {
            mario.setMatricula("012");
            mario.setCpf("497.985.457-10");
            mario.setNome("Mario Ruivo Silva");
            System.out.println(mario.settirarCopias(10));
        }
        else
            if (cond == 2) {
                System.out.println(jose.settirarCopias(20));
            }
            else
                if (cond == 3) {
                    System.out.println(maria.settirarCopias(1));
                }
                else {
                    System.out.printf("ErroR-Tente-Novamente");
                }
    }
}
