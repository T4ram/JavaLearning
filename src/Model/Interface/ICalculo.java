package Model.Interface;

public interface ICalculo<T> {

    T calcular(T valor1, T valor2);

    /* Type Parameter (Parâmetro de tipo)
    *  Serve como um parâmetro flexível (também chamado de autoboxing), as classes que implementarem
    *  esta interface conseguirão alterar o tipo do retorno ou o tipo das variáveis.
    * */

}
