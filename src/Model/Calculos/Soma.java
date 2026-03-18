package Model.Calculos;

import Model.Interface.ICalculo;

public class Soma implements ICalculo<Integer> {

    // sobrescreve e muda o retorno e as variaveis para Integer.
    @Override
    public Integer calcular(Integer valor1, Integer valor2){
        return valor1 + valor2;
    };
}

    // ps: os valores do Type Parameter não podem receber tipos primitivos, para isso usamos as Wrapper Classes
    // no lugar de int usamos Integer
    // no lugar de double usamos Double
    // e assim por diante...

