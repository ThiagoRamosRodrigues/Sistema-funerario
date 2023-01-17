
public class Aplicacao {

    public static void main(String[] args) {

        Corpo corpo = new Corpo(123,"Emilly");

        Tumulo tumulo = new Tumulo(123,"angola");

        Sepultamento sepultamento = new Sepultamento(5,"11/11/2022",corpo,tumulo);

        Exumacao exumacao = new Exumacao(1, "12/11/2022", sepultamento);

        System.out.println(exumacao);
        System.out.println(sepultamento);
        System.out.println(corpo);
        System.out.println(tumulo);

        corpo.sepultar();
        System.out.println(corpo);
        corpo.exumar();
        System.out.println(corpo);

        tumulo.ocupar();
        System.out.println(tumulo);
        tumulo.desocupar();
        System.out.println(tumulo);

        sepultamento.sepultar();
        System.out.println(sepultamento);

        exumacao.exumar();
        System.out.println(exumacao);
    }
}
