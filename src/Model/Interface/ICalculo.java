package Model.Interface;

public interface ICalculo<T,H> {

    H soma(H valor1, H valor2);

    H subtracao(H valor1, H valor2);

    T multiplicacao(T valor1, T valor2);

    /* Type Parameter (Parâmetro de tipo)
    *  Serve como um parâmetro flexível (também chamado de autoboxing), as classes que implementarem
    *  esta interface conseguirão alterar o tipo do retorno ou o tipo das variáveis.
    * */

}
