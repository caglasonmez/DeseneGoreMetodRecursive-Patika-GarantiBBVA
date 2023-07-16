package CaglaSonmez;

import java.util.Scanner;

public class DeseneGoreMetodRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N değeri giriniz: ");
        int n = input.nextInt();
        DeseneGoreMetodRecursive(n);
    }
    public static void DeseneGoreMetodRecursive(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");

        DeseneGoreMetodRecursive(n - 5);

        System.out.print(n + " ");
    }
}
