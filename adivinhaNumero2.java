import java.util.Scanner;
import java.util.Random;

public class adivinhaNumero2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        boolean jogarNovamente = true;
        int menorTentativas = Integer.MAX_VALUE;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        while (jogarNovamente) {
            System.out.println("\nEscolha um nível de dificuldade:");
            System.out.println("1 - Fácil (1 a 50)");
            System.out.println("2 - Médio (1 a 100)");
            System.out.println("3 - Difícil (1 a 200)");
            System.out.print("Digite sua escolha: ");
            int escolha = entrada.nextInt();

            int limiteSuperior;
            if (escolha == 1) {
                limiteSuperior = 50;
            } else if (escolha == 2) {
                limiteSuperior = 100;
            } else {
                limiteSuperior = 200;
            }

            int numeroAleatorio = random.nextInt(limiteSuperior) + 1;
            int tentativas = 0;
            int palpite = 0;

            System.out.println("\nTente adivinhar o número que o computador escolheu (entre 1 e " + limiteSuperior + ")!");

            while (palpite != numeroAleatorio) {
                System.out.print("Digite um número: ");
                palpite = entrada.nextInt();
                tentativas++;

                if (palpite < numeroAleatorio) {
                    System.out.println("O número é maior!");
                } else if (palpite > numeroAleatorio) {
                    System.out.println("O número é menor!");
                } else {
                    System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                    if (tentativas < menorTentativas) {
                        menorTentativas = tentativas;
                        System.out.println("Novo recorde! Você alcançou o menor número de tentativas!");
                    }
                }
            }

            System.out.println("\nDeseja jogar novamente? (1 - Sim, 2 - Não)");
            int resposta = entrada.nextInt();
            jogarNovamente = (resposta == 1);
        }

        System.out.println("\nObrigado por jogar! O menor número de tentativas foi: " + menorTentativas);
        entrada.close();
    }
}
