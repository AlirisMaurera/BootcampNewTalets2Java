package primeirosPassosComJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DividindoXporY {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();

        double divisao;

        for (int i = 0; i < n; i++) {
            double x = leitor.nextDouble();
            double y = leitor.nextDouble();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = x / y;
                System.out.printf("%.1f %n", divisao);
            }

        }
        leitor.close();
    }
}
