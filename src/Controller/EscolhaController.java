package Controller;
import View.BoasVindasView;
import View.LerDadosView;
import Model.CalculadoraModel;
import Model.PessoaModel;



public class EscolhaController {

    LerDadosView view = new LerDadosView();
    CalculadoraModel cal = new CalculadoraModel();
    PessoaModel ppl = new PessoaModel();
    BoasVindasView cad = new BoasVindasView();

    public void escolha(){

        ppl.setName(cad.boasVindas());
        cad.apresentação(ppl.getName());


        switch (view.mostrarInterface()){
            case 1:
                int v1 = view.lerInteiro("Digite um número inteiro: ");
                int v2 = view.lerInteiro("Digite um número inteiro: ");
                int resultadoSoma = cal.calcularSoma(v1,v2);
                view.mostrarMensagem("O resultado da soma é: " + resultadoSoma);
                break;
            case 2:
                double v3 = view.lerRaio();
                double resultadoArea = cal.calcularArea(v3);
                view.mostrarMensagem("A área do circulo é: " + resultadoArea);
                break;
        }
    }
}
