package primeirosPassosComJava;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int km = leitor.nextInt();
        int tempo = 2*km;
        System.out.println(tempo + " minutos");

        leitor.close();
    }
}
