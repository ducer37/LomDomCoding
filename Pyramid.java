import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int cur = n;
        for(int i = 0; i < n; i++){
            cur--;
            for(int j = 0; j < cur; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
