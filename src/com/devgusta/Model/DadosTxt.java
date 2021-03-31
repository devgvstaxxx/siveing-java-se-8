package com.devgusta.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class DadosTxt {
	
	public DadosTxt(){
		
	}
	
	public void guardaDadosLogin(String matricula, String senha) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Users\\gusta\\eclipse-workspace\\SIVEING-SE\\src\\com\\devgusta\\Docs\\logins.txt");
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter (osw);
		
	}
	
	public void abrirArquivoTxt() throws IOException, InterruptedException {
		String c = null;
		Scanner input = new Scanner (System.in);
		do {
			FileInputStream fis = new FileInputStream("C:\\Users\\gusta\\eclipse-workspace\\SIVEING-SE\\src\\com\\devgusta\\Docs\\welcome.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String leitura = br.readLine();
			while(leitura != null) {
				System.out.println(leitura);
				leitura = br.readLine();
			}	
			
			c = input.nextLine();
				
			br.close();
			} while(c == null);
		
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	}
	
	public void cadastraDadosCliente(String nome, String cpf, String email) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Users\\gusta\\eclipse-workspace\\SIVEING-SE\\src\\com\\devgusta\\Docs\\logins.txt");
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter (osw);
		
	}

}
