import javax.swing.JOptionPane;
public class LinearEquationSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        String result;
        if (a == 0) {
            if (b == 0) {
                result = "Infinitely many solutions.";
            } else {
                result = "No solution.";
            }
        } else {
            double x = -b / a;
            result = "The solution of " + a + "x + " + b + " = 0 is x = " + x;
        }

        JOptionPane.showMessageDialog(null, result);
    }
}

