import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chama o método menu passando o Scanner como parâmetro
        menu(sc);
    }

    // Método que exibe o menu e processa as figuras em loop
    public static void menu(Scanner sc) {

        while (true) {
            // Exibe as opções de figuras geométricas
            System.out.println("\n1 - Círculo");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Sair");
            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Pede o raio e calcula a área do círculo
                    System.out.print("Qual o raio do círculo?: ");
                    double raio = sc.nextDouble();

                    System.out.printf("A área do círculo é: %.2f%n", area(raio));
                    break;

                case 2:
                    // Pede base e altura e calcula a área do retângulo
                    System.out.print("Qual é a base do retângulo?: ");
                    double base = sc.nextDouble();

                    System.out.print("Qual a altura do retângulo?: ");
                    double altura = sc.nextDouble();

                    System.out.printf("A área do retângulo é: %.2f%n", area(base, altura));
                    break;

                case 3:
                    // Pede base e altura e calcula a área do triângulo
                    System.out.print("Qual a base do triângulo?: ");
                    double base2 = sc.nextDouble();

                    System.out.print("Qual a altura do triângulo?: ");
                    double altura2 = sc.nextDouble();

                    System.out.printf("A área do triângulo é: %.2f%n", area(base2, altura2, "Triângulo"));
                    break;

                case 4:
                    // Encerra o método e sai do programa
                    System.out.println("Fim do programa!");
                    sc.close();
                    return;
            }
        }
    }

    // Sobrecarga 1 — calcula a área do círculo: π × raio²
    public static double area(double raio) {
        return Math.PI * raio * raio;
    }

    // Sobrecarga 2 — calcula a área do retângulo: base × altura
    public static double area(double base, double altura) {
        return base * altura;
    }

    // Sobrecarga 3 — calcula a área do triângulo: (base × altura) / 2
    public static double area(double base, double altura, String figura) {
        return (base * altura) / 2;
    }
}