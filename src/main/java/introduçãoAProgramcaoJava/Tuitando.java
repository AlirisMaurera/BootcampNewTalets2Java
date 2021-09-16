package introduçãoAProgramcaoJava;

import java.util.Scanner;

public class Tuitando {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String messagem = leitor.nextLine();
        System.out.println(messagem.length() >=1 && messagem.length()<=140? "TWEET" : "MUTE");
        leitor.close();
    }
}
