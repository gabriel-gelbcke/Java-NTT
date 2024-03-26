package inside;
public class Filme {

    private String nomeFilme;
    private int dataFilme;
    private int Oscars;
    private String generoFilme;

    public String NomeFilme() {

        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {

        this.nomeFilme = nomeFilme;
    }

    public int DataFilme() {

        return dataFilme;
    }

    public void setDataFilme(int dataFilme) {
        this.dataFilme = dataFilme;
    }

    public int Oscars() {

        return Oscars;
    }

    public void setOscars(int oscars) {

        Oscars = oscars;
    }

    public String GeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }
}
