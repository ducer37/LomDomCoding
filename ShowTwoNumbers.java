import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args){
        String snum1, snum2;
        String ntf = "You've just entered";
        snum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        snum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        ntf = ntf + ' ' + snum1 + " and " + snum2;
        JOptionPane.showMessageDialog(null, ntf, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
