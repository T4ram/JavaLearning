package Controller;
import View.BoasVindasView;
import View.LerDadosView;
import Model.Calculos.Calculo;
import Model.Entity.PessoaModel;



public class EscolhaController {

    LerDadosView view = new LerDadosView();
    Calculo cal = new Calculo();
    PessoaModel ppl = new PessoaModel();
    BoasVindasView cad = new BoasVindasView();

    public void escolha(){
        ppl.setName(cad.boasVindas());
        cad.apresentação(ppl.getName());

        switch (view.mostrarInterface()){
            case 1:
                double v1 = view.lerInteiro("Digite um número inteiro: ");
                double v2 = view.lerInteiro("Digite um número inteiro: ");
                double resultadoSoma = cal.soma(v1,v2);
                view.mostrarMensagem("O resultado da soma é: " + resultadoSoma);
                break;
            case 2:
                //double v3 = view.lerRaio();
                //double resultadoArea = cal.calcularArea(v3);
               // view.mostrarMensagem("A área do circulo é: " + resultadoArea);
                break;
        }
    }
}
