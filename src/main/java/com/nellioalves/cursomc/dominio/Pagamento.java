package com.nellioalves.cursomc.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.nellioalves.cursomc.enums.EstadoPagamento;

@Entity
public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private EstadoPagamento estado;
	public Pagamento() {
	}
	public Pagamento(Integer id, EstadoPagamento estado) {
		super();
		this.id = id;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", estado=" + estado + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Integer getId() { return this.id; }
	public EstadoPagamento getEstado() { return this.estado; }
	public void setId(Integer id) { this.id = id; }
	public void setEstado(EstadoPagamento estado) { this.estado = estado; }
}
