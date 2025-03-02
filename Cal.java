import javax.swing.JOptionPane;

public class Cal {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
        String notification = "Input: " + x1 + " and " + x2;
        double sum = x1 + x2;
        notification += "\nSum: " + sum;
        double dif = x1 - x2;
        notification += "\nDifference: " + dif;
        double pro = x1 * x2;
        notification += "\nProduct: " + pro;
        if (x2 == 0) {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero");
        } else {
            double quo = x1 / x2;
            notification += "\nQuotient: " + quo;
        }
        JOptionPane.showMessageDialog(null, notification);
    }
}