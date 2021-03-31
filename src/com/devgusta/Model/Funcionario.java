package com.devgusta.Model;

import java.util.Scanner;

public class Funcionario {
	private Long id;
	private String matricula;
	private String nome;
	private String senha;
	
	
	
	public Funcionario(String matricula, String nome, String senha) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.senha = senha;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void registraFuncionarioLogin() {
		System.out.println("Digite sua matricula para registrar:"); 
		this.setMatricula(sc.nextLine());
		System.out.println("Digite a senha para registrar:");
		this.setSenha(sc.nextLine());
		
		// inserir AQUI  a chamada do metodo guardadadostxt
		
		
	}
	
	public void guardaDadosTxt() {
		// file output stream
		// pega os dados digitados e salva em txt
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
