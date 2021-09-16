package primeirosdesafiosDeCodigoComJava;

import java.util.Scanner;

public class ValidacaoDeNota {

    public static void main(String[] args) throws Exception{

        Scanner leitor = new Scanner(System.in);
        int cont= 1;
        double nota, soma = 0;

        nota = leitor.nextDouble();
        while (cont<=2){
            if(nota>=0 && nota<=10){
                if(cont==2){
                    soma+=nota;
                    System.out.printf("media = %.2f", soma/2);
                    break;
                    }else {soma+= nota;
                           nota = leitor.nextDouble();
                           cont++;}

                }else {System.out.println("nota invalida");
                         nota = leitor.nextDouble();}
        }
    leitor.close();
    }
}
