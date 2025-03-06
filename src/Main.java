import java.util.Scanner;

public class Main {
    public static boolean isPar(int numero){
        return numero % 2 == 0;
    }
    
    public static int somaDoisNumeros(int n1, int n2){
      return n1 + n2;
    }
    public static void main(String[] args) {
        int resultado = somaDoisNumeros(3, 4);
        System.out.println("A soma é : " + resultado);


    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else{
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
          
           System.out.println("Digite um número inteiro positivo : ");
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Por favor, digite um número inteiro positivo.");
        }else{
            int fatorial = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é " + fatorial);
         
         int numero = 6;
        boolean resultado = isPar(numero);
        System.out.println("o número " + numero + " é par : " + resultado); 
        }

        }
    }
       
    }
}
