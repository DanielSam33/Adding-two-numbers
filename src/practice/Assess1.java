package practice;


import java.util.Scanner;

public class Assess1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean canTransform = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                canTransform = false;

                for (int divisor = 1; divisor <= arr[i]; divisor++) {
                    if (arr[i] % divisor == 0 && arr[i - 1] % divisor == 1) {
                        canTransform = true;
                        break;
                    }
                }
            }

            if (!canTransform) {
                break;
            }
        }

        if (canTransform) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
