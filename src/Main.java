public class Main {
    public static boolean isPar(int numero){
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        int numero = 6;
        boolean resultado = isPar(numero);
        System.out.println("o número " + numero + " é par : " + resultado);
    }
}
