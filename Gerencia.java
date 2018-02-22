package prova;

public class Gerencia {

	public static void main(String[] args) {
		Funcionarios gerencia = new Funcionarios();
		
		Endereco endchefe = new Endereco ("Rua do gold", "huarin","11300000", 1);
		Funcionario chefe = new Funcionario("123", "juao", "boss", 1000.0, endchefe);
		gerencia.adicionaFuncionario(chefe);
		
		Endereco end = new Endereco ("Rua do poco", "cristo","58000000", 5870);
		Funcionario peao = new Funcionario("999", "valmir", "servente", 400.0, chefe, end);
		gerencia.adicionaFuncionario(peao);
		
		
		gerencia.listaFuncionario();
		
		
		System.out.println(gerencia.qtdFuncionarios());
		
		//gerencia.listaFuncionarioCargo("boss");
		
		//System.out.println(gerencia.listaFuncionarioSalarioMenorQue(500.0));
		
		//gerencia.listaFuncionarioBairro("cristo");
		
		gerencia.removeFuncionario("juao");
		
		gerencia.listaFuncionario();
	}

}
