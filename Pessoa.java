public class Pessoa {
    String nomeDigitado;
    int idadeDigitada;
    

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
