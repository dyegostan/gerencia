package prova;

public class Funcionarios {
	
	private Funcionario[] listaFuncionarios;
	private int n=0;
	
	
	
	public Funcionarios() {
		
		this.listaFuncionarios = new Funcionario[50];
		
	}


	public Funcionario[] getListaFuncionarios() {
		return listaFuncionarios;
	}


	public void setListaFuncionarios(Funcionario[] listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public int qtdFuncionarios() {
		return n;
	}

	public void adicionaFuncionario(Funcionario f) {
		listaFuncionarios[n] = f;
		n++;
		System.out.println("funcionario adicionado");
	}
	public void listaFuncionario() {
		for(int i=0;i<n;i++) {
			System.out.println(listaFuncionarios[i].getNome());
		}
	}
	
	public void listaFuncionarioCargo(String cargo) {
		for(int i=0;i<qtdFuncionarios();i++) {
			if(listaFuncionarios[i].getCargo().equals(cargo)) {
				System.out.println(listaFuncionarios[i]);
			}
		}
	}
	public int listaFuncionarioSalarioMenorQue(Double salario) {
		int qtd=0;
		for(int i=0;i<qtdFuncionarios();i++) {
			if(listaFuncionarios[i].getSalario() < salario) {
				qtd++;
			}
		}
		return qtd;
	}
	public void listaFuncionarioBairro(String bairro) {
		for(int i=0;i<qtdFuncionarios();i++) {
			if(listaFuncionarios[i].getEndereco().getBairro().equals(bairro)) {
				System.out.println(listaFuncionarios[i]);
			}
		}
	}
	public void removeFuncionario(String nome) {
		Funcionario aux;
		for(int i=0;i<qtdFuncionarios();i++) {
			aux=listaFuncionarios[i+1];
			
			if(listaFuncionarios[i].getChefe().getNome().equals(nome)) {
				listaFuncionarios[i]=aux;
				
					
				}
		}
	}
	
}
