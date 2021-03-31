package com.devgusta.View;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaudacaoInicial {
	
	public static void main(String[] args) throws IOException {
		show();
	}

	public static void show() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\gusta\\eclipse-workspace\\SIVEING-SE\\src\\welcome.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
			
		String leitura = br.readLine();
			
		while(leitura != null) {
			System.out.println(leitura);
			leitura = br.readLine();
		}
			
		br.close();	
		
	}
		
	
}


