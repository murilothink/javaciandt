import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        boolean acertou = false;
        int tentativas = 3, chute;
        int numSorteado = random.nextInt(10) + 1;
        char continuar;

        while (tentativas > 0 && acertou == false){
            System.out.println("Digite um numero de 1 a 10 para adivinhar: ");
            chute = sc.nextInt();

            if (numSorteado == chute){
                System.out.println("Voce acertou! ");
                acertou = true;
            }else if(chute != numSorteado){
                --tentativas;
                System.out.println("Tente outra vez! " + tentativas + " tentativas restantes.");
            }

        }

    }
}
