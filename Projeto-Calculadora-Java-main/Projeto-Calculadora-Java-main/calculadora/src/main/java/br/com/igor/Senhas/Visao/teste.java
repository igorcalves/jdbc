package br.com.igor.Senhas.Visao;

import br.com.igor.Senhas.Modelo.ProcessarSenha;

public class teste {

    public static void main(String[] args) {
        ProcessarSenha p1 = new ProcessarSenha();
        p1.Processar("404466");

        System.out.println(ProcessarSenha.instancia.Processar("404466"));

    
    }
    
}
