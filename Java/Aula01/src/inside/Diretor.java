package inside;

public class Diretor extends Filme{

    private String nomeDiretor;
    private int idadeDiretor;

    public String NomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public int IdadeDiretor() {
        return idadeDiretor;
    }

    public void setIdadeDiretor(int idade) {
        this.idadeDiretor = idade;
    }
}
