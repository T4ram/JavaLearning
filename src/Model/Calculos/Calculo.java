package Model.Calculos;

import Model.Interface.ICalculo;

public class Calculo implements ICalculo<Float, Double> {

    // sobrescreve e muda o retorno e as variaveis para o tipo necessário.
    @Override
    public Double soma(Double valor1, Double valor2){
        return valor1 + valor2;
    };

    @Override
    public Double subtracao(Double valor1, Double valor2){ return valor1 - valor2; }

    @Override
    public Float multiplicacao(Float valor1, Float valor2){ return valor1 * valor2; }
}

    // ps: os valores do Type Parameter não podem receber tipos primitivos, para isso usamos as
    // Wrapper Classes
    // no lugar de int usamos Integer
    // no lugar de double usamos Double
    // e assim por diante...

