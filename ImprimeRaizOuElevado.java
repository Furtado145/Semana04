import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class ImprimeRaizOuElevado {
    public static void main(String[] args) {
        double num01;
        String resp;

        num01 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Digite um valor:")
        );
        DecimalFormat df = new DecimalFormat("###.##");
        if (num01 > 0) {
            resp = "A Raiz Quadrada do valor dado é:\n";
            resp = resp + df.format(Math.sqrt(num01));            
        } else {
            resp = "O valor elevado ao quadrado é:\n";
            resp = resp + (int) Math.pow(num01, 2);
        }

        JOptionPane.showMessageDialog(null, resp);
    }
}