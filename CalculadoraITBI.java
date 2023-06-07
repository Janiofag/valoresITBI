import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor da transação:");
        double valorTransacao = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o valor venal:");
        double valorVenal = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o percentual de imposto:");
        double percentualImposto = Double.parseDouble(input);

        double maiorValor = Math.max(valorTransacao, valorVenal);
        double valorImposto = maiorValor * percentualImposto / 100;

        JOptionPane.showMessageDialog(null, "Valor do imposto a ser pago: " + valorImposto);
    
        //input.close();
    }
}
