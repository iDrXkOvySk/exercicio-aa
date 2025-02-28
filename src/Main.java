public class Main {

    public static double calcularMedia(double[] numeros){
        double soma = 0;

        for (double numero : numeros){
            soma += numero;
        }
        return soma / numeros.length;
    }
    public static void main(String[] args) {
        double[] numeros = {10,20,30,40,50,60,70,80,90,100};

        double media = calcularMedia(numeros);
        System.out.println("A média dos números é : " + media);
    }
}
