import java.util.Scanner;

public class Main {

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else{
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo : ");
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Por favor, digite um número inteiro positivo.");
        }else{
            int fatorial = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }

    }

}
