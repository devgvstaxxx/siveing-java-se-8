package com.devgusta.Controller;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RegistraDadosArquivoClientes {
	
	private static Formatter output;	

	public static void main(String[] args) {
		abrirArquivo();
		registraDados();
		fecharArquivo();
	}
	
	public static void abrirArquivo() {		
		try {
			output = new Formatter("clientes.txt");
		} catch(SecurityException se) {
			System.err.println("Não é permitido escrever nesse Arquivo");
			System.exit(1);
		} catch (FileNotFoundException fnfe) {
			System.err.println("Erro ao abrir o arquivo");
			System.exit(1);
		}
	}
	
	
	public static void registraDados() {
		Scanner input = new Scanner (System.in);
		System.out.printf("%s%s%s%n", "Digite o nome:", "Digite o CPF:", "Digite o Email:");
		//while(input.hasNext()) {
			try {
				output.format("%s;%s;%s;%n", input.nextLine(), input.nextLine(), input.nextLine());
			} catch(FormatterClosedException fce) {
				System.err.println("Erro ao escrever no arquivo");
				//break;
			} catch(NoSuchElementException ee) {
				System.err.println("Entrada invalida. Tente novamente");
				input.nextLine();
			}		
	} 

	
	public static void fecharArquivo() {
		if(output!=null)
			output.close();
	}

}
