package excecao.PersonalizadaB;

public class NumeroForaDoIntervalo extends Exception{
    private String nomeDoAtribuString;
    public NumeroForaDoIntervalo(String nomeDoAtributo) {
            this.nomeDoAtribuString = nomeDoAtributo;

    }
    

    public String getMessage() {
        return String.format(
            "O atributo '%s' esta fora do Intervalo", 
            nomeDoAtribuString);
    }
    
}
