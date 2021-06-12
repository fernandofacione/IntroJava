// 1 - Pacote
package fundamentos;

// 2 - Bicliotecas

import java.util.Scanner;

// 3 - Classe

public class Medidas {
    // 3.1 - Atributos


    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Área do Quadrado");
        System.out.println("(2) - Área do Retângulo");
        System.out.println("(3) - Área do Triângulo");
        System.out.println("(4) - Área do Círculo");

    }

    public static int calcularAreaDoQuadrado(){
        Scanner entrada = new Scanner(System.in); // criamos o objeto para ler uma entrada no console
        System.out.println("Digite o tamanho do lado: ");
        int lado = entrada.nextInt(); //leitura do tamanho do lado
        int area = lado ^ 2;

    }



}