import inside.Ator;
import inside.Diretor;
import inside.Filme;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        Filme filme1 = createFilme(in);

        Ator ator1 = createAtor(in, 1);
        Ator ator2 = createAtor(in, 2);
        Ator ator3 = createAtor(in, 3);

        Diretor diretor1 = createDiretor(in, 1);
        Diretor diretor2 = createDiretor(in, 2);

        System.out.println();

        System.out.printf("%s, é um filme de %s que foi lançado em %d e obteve %d Oscars." ,
                filme1.NomeFilme() , filme1.GeneroFilme() , filme1.DataFilme() , filme1.Oscars());

        System.out.println();
        System.out.println();

        System.out.println("Entre os atores que se destacaram no filme temos:");
        System.out.printf("%s de %d anos como Batman, ", ator1.NomeAtor(), ator1.IdadeAtor());
        System.out.printf("%s de %d anos como Coringa ", ator2.NomeAtor(), ator2.IdadeAtor());
        System.out.printf("e %s de %d anos como Arlequina. ", ator3.NomeAtor(), ator3.IdadeAtor());

        System.out.println();
        System.out.println();

        System.out.printf("O filme foi dirigido pelos irmãos, %s de %d anos e %s de %d anos",
                diretor1.NomeDiretor(), diretor1.IdadeDiretor(),
                diretor2.NomeDiretor(), diretor2.IdadeDiretor());

    }
    private static Filme createFilme(Scanner in)
    {
        Filme filme = new Filme();

        System.out.println("Digite o nome do Filme:");
        filme.setNomeFilme(in.next());

        System.out.println("Digite o genero do Filme:");
        filme.setGeneroFilme(in.next());

        System.out.println("Digite o ano de Lançamento:");
        filme.setDataFilme(in.nextInt());

        System.out.println("Digite a quantidade de Oscars:");
        filme.setOscars(in.nextInt());

        return filme;
    }

        private static Ator createAtor(Scanner in, int x)
    {
        int y = x;
        Ator ator = new Ator();

        System.out.println("Digite o nome do " + y + "° Ator:");
        ator.setNomeAtor(in.next());

        System.out.println("Digite a idade do " + y + "° Ator:");
        ator.setIdadeAtor(in.nextInt());

        return ator;
    }

    private static Diretor createDiretor(Scanner in, int x)
    {
        int y = x;
        Diretor diretor = new Diretor();

        System.out.println("Digite o nome do " + y + "° Diretor:");
        diretor.setNomeDiretor(in.next());

        System.out.println("Digite a idade do " + y + "° Diretor:");
        diretor.setIdadeDiretor(in.nextInt());

        return diretor;
    }
}



