public class Main {

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

    public static void main(String[] args) {
        String texto = "Exemplo de contagem de vogais";

        int quantidadeVogais = contarVogais(texto);
        System.out.println("Quantidade de vogais : " + quantidadeVogais);
    }
}
