import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / n;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + " Sum: " + sum + " Average: " + avg);
        sc.close();
    }
}
