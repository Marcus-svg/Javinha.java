public class Pessoa {
    private String nomeDigitado;
    private int idadeDigitada;

    public String getNomeDigitado() {
        return nomeDigitado;
    }

    public void setNomeDigitado(String nomeDigitado) {
        this.nomeDigitado = nomeDigitado;
    }

    public int getIdadeDigitada() {
        return idadeDigitada;
    }

    public void setIdadeDigitada(int idadeDigitada) {
        this.idadeDigitada = idadeDigitada;
    }

    //Construtor;;
    public Pessoa(String nome, int idade) {
        this.nomeDigitado = nome;
        this.idadeDigitada = idade;
    }
    //;;

    public boolean eMaiorDeIdade() {
        if(idadeDigitada >=18) {
            return true;
        
        } else {
            return false;
        }
    }
}
