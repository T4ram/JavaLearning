package View;

import java.util.Scanner;

public class LerDadosView {
    Scanner sc = new Scanner(System.in);

    public int mostrarInterface(){
        System.out.println("Controller.Escolha uma opção, digite: ");
        System.out.println("1. Para somar ");
        System.out.println("2. Para saber a àrea de um circulo ");

        return sc.nextInt();
    }

    public double lerRaio(){
        System.out.println("Digite o valor do raio do circulo:");
        return sc.nextDouble();
    }

    public int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        return sc.nextInt();
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
