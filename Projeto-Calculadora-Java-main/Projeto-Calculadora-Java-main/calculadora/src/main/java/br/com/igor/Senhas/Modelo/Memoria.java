package br.com.igor.Senhas.Modelo;


import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private static final Memoria instancia = new Memoria();
    private String textoAtual= "";
    private String textoBuffer = "";
    
    
    private List<Observadores> observadores = new ArrayList<>();


    public void processarComando(String textoAtual){
        if("1".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("2".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("3".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("4".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("5".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("6".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("7".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("8".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("9".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("0".equals(textoAtual)){
            this.textoAtual += "*";
            textoBuffer += textoAtual;
        }else if("Mostrar".equals(textoAtual)){
            this.textoAtual = ">>> " + this.textoBuffer;
        }else if("ENTER".equals(textoAtual)){
            if(ProcessarSenha.instancia.Processar(this.textoBuffer)){
                this.textoAtual = "Logado";
            }
            else{
                this.textoAtual = "erro";
            }
                     
            
        }else if("Apagar".equals(textoAtual)){
            this.textoAtual = "";
        
            
        }

        observadores.forEach(o -> o.ValorAlterado(this.textoAtual));
        
        if("erro". equals(this.textoAtual) || "Logado".equals(this.textoAtual) || "Mostrar".equals(textoAtual)){
            this.textoAtual = "";
            textoBuffer = "";
        }
        
        
        
    }
    
    
    public void adicionarObservador(Observadores observadores){
        this.observadores.add(observadores);
    }

    public Memoria(){
    }


    public String getTextoAtual() {
        return textoAtual;
    }

    public void setTextoAtual(String textoAtual) {
        this.textoAtual = textoAtual;
    }



    public static Memoria getInstancia() {
        return instancia;
    }
    
    
    
}
