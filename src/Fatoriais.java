import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede o número ao usuário
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // Chama as duas versões e exibe os resultados
        System.out.println("Iterativa: " + fatorialIterativa(num));
        System.out.println("Recursiva: " + fatorialRecursiva(num));
    }

    // Versão iterativa — calcula o fatorial usando um loop for
    public static long fatorialIterativa(int n) {

        long resultado = 1;

        // Multiplica resultado por cada número de 1 até n
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Versão recursiva — o método chama a si mesmo com n-1
    public static long fatorialRecursiva(int n) {

        // Caso base: fatorial de 0 ou 1 é sempre 1
        if (n <= 1) {
            return 1;
        }

        // Caso recursivo: n × fatorial do número anterior
        return n * fatorialRecursiva(n - 1);
    }
}

