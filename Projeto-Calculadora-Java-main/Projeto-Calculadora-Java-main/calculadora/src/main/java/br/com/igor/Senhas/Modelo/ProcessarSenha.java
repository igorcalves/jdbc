package br.com.igor.Senhas.Modelo;

public class ProcessarSenha {

    public static ProcessarSenha instancia = new ProcessarSenha();

    
    private final String senha = "404466";
    
    public  Boolean Processar(String valor){
        if(valor.equals(senha)){
         return true;   
        }
        return false;
    
}
    public ProcessarSenha getInstancia() {
        return instancia;
    }


}