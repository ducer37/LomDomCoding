import javax.swing.JOptionPane;
public class LinearSystemSolver {
    public static void main(String[] args) {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double determinant = a11 * a22 - a12 * a21;

        String result;
        if (determinant == 0) {
            if (a11 * b2 == a21 * b1 && a12 * b2 == a22 * b1) {
                result = "Infinitely many solutions.";
            } else {
                result = "No solution.";
            }
        } else {
            double x = (b1 * a22 - b2 * a12) / determinant;
            double y = (a11 * b2 - a21 * b1) / determinant;
            result = "The system has a unique solution:\n x = " + x + "\n y = " + y;
        }

        JOptionPane.showMessageDialog(null, result);
    }
}

