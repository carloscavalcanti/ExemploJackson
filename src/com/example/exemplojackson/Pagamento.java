package com.example.exemplojackson;

public class Pagamento {
	
	private Funcionario funcionario;
	private Double valor;
	
	public Pagamento() {
	}
	
	public Pagamento(Funcionario funcionario, Double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
