package MinhaImplementacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "pessoas_Teste")
public class Pessoa{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	private String nome;
	
	private String tipo;
	
	
	public Pessoa() {
	
	}


	public Pessoa(Long id, String nome, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
