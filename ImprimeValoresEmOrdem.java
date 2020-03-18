import javax.swing.JOptionPane;
public class ImprimeValoresEmOrdem {
    public static void main(String[] args) {
        double num01, num02, num03;
        String resp;

        num01 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Digite o primeiro valor:")
        );
        num02 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Digite o segundo valor:")
        );
        num03 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Digite o terceito valor:")
        );

        resp = "A ordem crescente dos valores é:\n";
        if (num01 <= num02 && num01 <= num03) {
            if (num02 <= num03) {
                resp += num01 + ", " + num02 + ", " + num03 + ".";
            } else {
                resp += num01 + ", " + num03 + ", " + num02 + ".";
            }
            
        } else if (num02 <= num01 && num02 <= num03) {
            if (num01 <= num03) {
                resp += num02 + ", " + num01 + ", " + num03 + ".";
            } else {
                resp += num02 + ", " + num03 + ", " + num01 + ".";
            }
        }

        else{
            if (num02 <= num01) {
                resp += num03 + ", " + num02 + ", " + num01 + ".";
            } else {
                resp += num03 + ", " + num01 + ", " + num02 + ".";
            }
        }
            JOptionPane.showMessageDialog(null, resp);
    }    
}