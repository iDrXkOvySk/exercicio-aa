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
          

             double[] numeros = {10,20,30,40,50,60,70,80,90,100};

        double media = calcularMedia(numeros);
        System.out.println("A média dos números é : " + media);

           String texto = "Exemplo de contagem de vogais";

        int quantidadeVogais = contarVogais(texto);
        System.out.println("Quantidade de vogais : " + quantidadeVogais);

    }

        if (n < 0){
            System.out.println("Por favor, digite um número inteiro positivo.");
        }else{
            int fatorial = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é " + fatorial);
         
         int numero = 6;
        boolean resultado = isPar(numero);
        System.out.println("o número " + numero + " é par : " + resultado); 
       
        String texto = "Exemplo de String";
        String textoInvertido = inverterString(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);


    public static double calcularMedia(double[] numeros){
        double soma = 0;

        for (double numero : numeros){
            soma += numero;
        }
        return soma / numeros.length;
    }

    public static int contarVogais(String str){
        int contador = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;
    }  

        }
    public static String inverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
   }
  }  
 }
}

