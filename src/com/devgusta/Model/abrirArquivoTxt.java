package com.devgusta.Model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class abrirArquivoTxt {

	public static void main(String[] args) throws IOException, InterruptedException {
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

}
