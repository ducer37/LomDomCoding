import java.util.Scanner;
public class Cal {
    public static void main(String[] args){
        double s1, s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        System.out.println(s1 + s2);
        System.out.println(s1 - s2);
        System.out.println(s1 * s2);
        if(s1 % s2 == 0) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
