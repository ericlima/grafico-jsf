package com.lima;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pageModel")
@ViewScoped
public class pageModel {

	private List<String> meses;

	@PostConstruct
	public void init() {

		meses = new ArrayList<>();

		meses.add("Janeiro");
		meses.add("Fevereiro");
		meses.add("Mar�o");
		meses.add("Abril");
		meses.add("Maio");
		meses.add("Junho");
		meses.add("Julho");
		meses.add("Agosto");
		meses.add("Setembro");
		meses.add("Outubro");
		meses.add("Novembro");
		meses.add("Dezembro");

	}

	public List<String> getMeses() {
		return meses;
	}

	public void setMeses(List<String> meses) {
		this.meses = meses;
	}

	public String getData() {

		StringBuilder sb = new StringBuilder();

		sb.append("[ ['Mes', 'Valor'],");
		
		// os meses estao vindo de uma lista pra carregada, mas poderiam vir da base de dados
		
		for(String mes: meses) {
		   sb.append("	 ['" + mes + "',  8],");
		}
		sb.append("]");
		

		return sb.toString();

	}

}
