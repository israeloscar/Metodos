import java.util.Scanner;

public class CalculadoraMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chama o método menu passando o Scanner como parâmetro
        menu(sc);
    }

    // Método que soma dois números e retorna o resultado
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    // Método que subtrai dois números e retorna o resultado
    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    // Método que multiplica dois números e retorna o resultado
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método que divide dois números e retorna o resultado
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    // Método que exibe o menu e processa as operações em loop
    public static void menu(Scanner sc) {

        while (true) {

            // Pede os dois números ao usuário
            System.out.print("Digite o primeiro numero: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo numero: ");
            double num2 = sc.nextDouble();

            // Exibe as opções do menu
            System.out.println("\n---MENU---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            // Executa a operação escolhida pelo usuário
            switch (opcao) {
                case 1:
                    System.out.println(somar(num1, num2));
                    break;

                case 2:
                    System.out.println(subtrair(num1, num2));
                    break;

                case 3:
                    System.out.println(multiplicar(num1, num2));
                    break;

                case 4:
                    // Valida se o divisor é zero antes de dividir
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por 0!");
                    } else {
                        System.out.println(dividir(num1, num2));
                    }
                    break;

                case 5:
                    // Encerra o método inteiro e sai do programa
                    System.out.println("Saindo do programa, até logo!");
                    sc.close();
                    return;

                default:
                    // Opção digitada não existe no menu
                    System.out.println("Opção inválida!");
            }
        }
    }
}