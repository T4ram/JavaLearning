package View;
import Model.PessoaModel;
import java.util.Scanner;

public class BoasVindasView {

    Scanner sc = new Scanner(System.in);
    PessoaModel ppl = new PessoaModel();
    String nome;

    public String boasVindas(){
        System.out.println("Seja bem vindo ao meu projeto, digite seu nome:");
        nome = sc.next();
        ppl.Setname(nome);
        return nome;
    }

    public void apresentação(String nome){
        System.out.println("Olá, " + nome + " o que deseja fazer hoje?");
    }

}
