package prova;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	private int numero;
	

public Endereco (String rua, String bairro, String cep, int numero) {
	
	this.rua = rua;
	this.bairro = bairro;
	this.cep = cep;
	this.numero = numero;
	
}


public String getRua() {
	return rua;
}


public void setRua(String rua) {
	this.rua = rua;
}


public String getBairro() {
	return bairro;
}


public void setBairro(String bairro) {
	this.bairro = bairro;
}


public String getCep() {
	return cep;
}


public void setCep(String cep) {
	this.cep = cep;
}


public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}


@Override
public String toString() {
	return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cep=" + cep + ", numero=" + numero + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
	result = prime * result + ((cep == null) ? 0 : cep.hashCode());
	result = prime * result + numero;
	result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
	Endereco other = (Endereco) obj;
	if (bairro == null) {
		if (other.bairro != null)
			return false;
	} else if (!bairro.equals(other.bairro))
		return false;
	if (cep == null) {
		if (other.cep != null)
			return false;
	} else if (!cep.equals(other.cep))
		return false;
	if (numero != other.numero)
		return false;
	if (rua == null) {
		if (other.rua != null)
			return false;
	} else if (!rua.equals(other.rua))
		return false;
	return true;
}


}