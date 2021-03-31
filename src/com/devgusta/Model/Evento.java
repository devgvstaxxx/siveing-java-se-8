package com.devgusta.Model;

public class Evento {
	private Long id;
	private String nomeEvento;
	private String local;
	private Long qtdeIngressosDisponiveis;
	private Double valorIngresso;
	
	
	public Evento(String nomeEvento, String local, Long qtdeIngressosDisponiveis, Double valorIngresso) {
		super();
		this.nomeEvento = nomeEvento;
		this.local = local;
		this.qtdeIngressosDisponiveis = qtdeIngressosDisponiveis;
		this.valorIngresso = valorIngresso;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Long getQtdeIngressosDisponiveis() {
		return qtdeIngressosDisponiveis;
	}
	public void setQtdeIngressosDisponiveis(Long qtdeIngressosDisponiveis) {
		this.qtdeIngressosDisponiveis = qtdeIngressosDisponiveis;
	}
	public Double getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(Double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	
	

}
