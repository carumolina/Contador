import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int aleatorio = new Random().nextInt(100);

        Scanner numUsuario = new Scanner(System.in);

        System.out.print("Digite um número: ");

        numUsuario =  numUsuario.nextInt();

    }
}