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

        int numero = 6;
        boolean resultado = isPar(numero);
        System.out.println("o número " + numero + " é par : " + resultado);     
    }
}
