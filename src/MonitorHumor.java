import java.util.Scanner;
import java.util.Random;

public class MonitorHumor {

    public static String[] sentimentos = {"feliz", "triste", "raivoso", "ansioso", "nervoso", "alegre", "enjoado"};

    public static String verificarHumor(String alimento) {
        Random random = new Random();
        int indiceSentimento = random.nextInt(sentimentos.length);
        return sentimentos[indiceSentimento];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Digitar um novo alimento");
            System.out.println("2 - Sair do programa");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite o alimento que você consumiu: ");
                    String alimentoConsumido = scanner.nextLine();

                    String humorResultante = verificarHumor(alimentoConsumido);

                    System.out.println("\nDepois de comer " + alimentoConsumido + ", você está se sentindo " + humorResultante + ".\n");
                    break;
                case 2:
                    System.out.println("Até mais ver");
                    continuar = false;
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
        }

        scanner.close();
    }
}
