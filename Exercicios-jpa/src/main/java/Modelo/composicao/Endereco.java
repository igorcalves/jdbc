package Modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	
	private String logradouro;
	private String comeplemento;
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComeplemento() {
		return comeplemento;
	}
	public void setComeplemento(String comeplemento) {
		this.comeplemento = comeplemento;
	}
	
	
}

