public class ex2 {

    public static void main(String[] args) {

        double s, n1, n11, n2;
        s=0;
        n1=37;
        n11=38;
        n2=1;
        for(double c=0; c < 37; c++){

            s += (n1*n11)/n2;
            System.out.println("S = " + n1 + "*" + n11 + "/" + n2);
            n1--;
            n11--;
            n2++;

        }
        System.out.println("Valor de S é: " + s);
    }
    }

