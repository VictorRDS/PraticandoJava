

        import javax.swing.JOptionPane;

    public class number {
        public static void main(String[] args) {
            String firstNumber, secondNumber;
                    int number1, number2, sum;
            firstNumber = JOptionPane.showInputDialog(" Enter com o primeiro numero: ");
            secondNumber = JOptionPane.showInputDialog("Entre com o segundo numero: ");

            number1= Integer.parseInt( firstNumber );
            number2= Integer.parseInt( secondNumber );
            sum = number1 + number2;

            System.out.println("A Sua soma foi " + sum);
            //JOptionPane.showInputDialog(null, "The sum is "+ sum , "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

}
