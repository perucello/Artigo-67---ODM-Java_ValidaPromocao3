package com.educaciencia.odm.validaPromocao;

public class ValidaProduto {

	private String ValidaProdutonome;
	private String ValidaProdutodescricao;
	private String ValidaProdutofabricante;

	public ValidaProduto() {
		super();
	}

	public ValidaProduto(String validaProdutonome,
			String validaProdutodescricao, String validaProdutofabricante) {
		super();
		ValidaProdutonome = validaProdutonome;
		ValidaProdutodescricao = validaProdutodescricao;
		ValidaProdutofabricante = validaProdutofabricante;
	}

	public String getValidaProdutonome() {
		return ValidaProdutonome;
	}

	public void setValidaProdutonome(String validaProdutonome) {
		ValidaProdutonome = validaProdutonome;
	}

	public String getValidaProdutodescricao() {
		return ValidaProdutodescricao;
	}

	public void setValidaProdutodescricao(String validaProdutodescricao) {
		ValidaProdutodescricao = validaProdutodescricao;
	}

	public String getValidaProdutofabricante() {
		return ValidaProdutofabricante;
	}

	public void setValidaProdutofabricante(String validaProdutofabricante) {
		ValidaProdutofabricante = validaProdutofabricante;
	}

}
