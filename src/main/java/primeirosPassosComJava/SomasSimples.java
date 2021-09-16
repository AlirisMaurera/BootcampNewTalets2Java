package primeirosPassosComJava;

import java.util.Scanner;

public class SomasSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int soma = (a)+(b);

        System.out.println("SOMA = " + soma);
        leitor.close();

    }
}
