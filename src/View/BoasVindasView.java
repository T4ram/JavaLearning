package View;
import java.util.Scanner;

public class BoasVindasView {

    Scanner sc = new Scanner(System.in);

    public String boasVindas(){
        System.out.println("Seja bem vindo ao meu projeto, digite seu nome:");
        return sc.next();
    }

    public void apresentação(String nome){
        System.out.println("Olá, " + nome + " o que deseja fazer hoje?");
    }

}
