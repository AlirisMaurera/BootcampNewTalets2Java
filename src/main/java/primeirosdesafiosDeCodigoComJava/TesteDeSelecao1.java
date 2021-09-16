package primeirosdesafiosDeCodigoComJava;

import java.util.Scanner;

public class TesteDeSelecao1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int A, B, C, D;
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        if(B>C && D>A && (C+D)>(A+B) && C>=0 && D>=0 && A%2 == 0){
            System.out.println("Valores aceitos");
            } else System.out.println("Valores nao aceitos");

    }
}
