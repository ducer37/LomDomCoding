import javax.swing.JOptionPane;
public class SecondDegreeEqSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        String result;

        if (a == 0) {
            if (b == 0) {
                result = (c == 0) ? "Infinitely many solutions." : "No solution.";
            } else {
                double x = -c / b;
                result = "This is a linear equation. The solution is x = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "Two distinct real solutions:\n x1 = " + x1 + "\n x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Double root: x = " + x;
            } else {
                result = "No real solution.";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
