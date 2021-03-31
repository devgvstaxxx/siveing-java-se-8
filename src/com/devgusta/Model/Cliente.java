package com.devgusta.Model;

import java.util.Scanner;

public class Cliente {
	
	Scanner sc = new Scanner (System.in);
	@SuppressWarnings("unused")
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	
	

	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public Cliente() {
		
	}
	
	public void setId(Integer i) {
		this.id = i;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	


}
