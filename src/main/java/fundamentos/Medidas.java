// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada;

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area; // receber o resultado dos cálculos de área

        entrada = new Scanner(System.in); //instanciar o objeto de leitura do console

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); //leitura da opção
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            default:
                throw new IllegalStateException("Valor invalido: " + opcao);
        }

        System.out.println("A area e de " + area + "m²");

    }
    public static int calcularAreaDoQuadrado() {

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado ^ 2; // retorna a área do quadrado

    }
    public static int calcularAreaDoRetangulo() {

        int base; // tamanho da base do retangulo
        int altura; // tamanho da altura do retangulo

        System.out.println("Digite o tamanho do lado: ");
        base = entrada.nextInt(); //leitura do tamanho do lado
        altura = entrada.nextInt(); //leitura do tamanho do lado
        return base * altura; // retorna a área do quadrado

    }
}