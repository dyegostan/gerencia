package prova;

public class Funcionario {
	
	private String matricula;
	private String nome;
	private String cargo;
	private Double salario;
	private Funcionario chefe;
	private Endereco endereco;

	
	public Funcionario (String matricula, String nome, String cargo, Double salario, Funcionario chefe, Endereco endereco) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.chefe = chefe;
		this.endereco = endereco;
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Funcionario(String matricula, String nome, String cargo, Double salario, Endereco endereco) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.endereco = endereco;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Funcionario getChefe() {
		return chefe;
	}


	public void setChefe(Funcionario chefe) {
		this.chefe = chefe;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario
				+ ", chefe=" + chefe + ", endereco=" + endereco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((chefe == null) ? 0 : chefe.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (chefe == null) {
			if (other.chefe != null)
				return false;
		} else if (!chefe.equals(other.chefe))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}


	
}
