import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int aleatorio = new Random().nextInt(100);

        int numUsuario;

        int tentativas = 0;

        while (tentativas <=5) {

            System.out.print("Digite um número: ");

            numUsuario = leitor.nextInt();

            if (aleatorio == numUsuario) {

                System.out.println("Você acertou o número");
                break;
            }
            System.out.println("Você errou, tente novamente: ");
            tentativas++;

        }

        if(tentativas == 5){
            System.out.println("Você não acertou, o número era: " + leitor);
        }

    }
}