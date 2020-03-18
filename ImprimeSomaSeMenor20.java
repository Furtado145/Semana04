import javax.swing.JOptionPane;
public class ImprimeSomaSeMenor20 {
    public static void main(String[] args){
        int num01, num02, soma;

        num01 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o primeiro valor:")
        );

        num02 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o segundo valor:")
        );

        soma = num01 + num02;

        if (soma <= 20) {
            soma -= 5;
            JOptionPane.showMessageDialog(null, "A soma dos valores dados menos 5 é: " + soma);
        } else {
            JOptionPane.showMessageDialog(null, "Valor excedeu o limite");
        }
    }
}