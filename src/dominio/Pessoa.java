package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//Essa anota��o identifica que essa classe � uma entidade de dom�nio que ir� corresponder a uma tabela
@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String email;
	private String nome;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String email, String nome) {
		Id = id;
		this.email = email;
		this.nome = nome;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [Id=" + Id + ", email=" + email + ", nome=" + nome + "]";
	}
	
	
	
	
}
