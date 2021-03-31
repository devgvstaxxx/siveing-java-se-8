package com.devgusta.Test;

import java.io.IOException;
import java.util.Scanner;

import com.devgusta.Model.Cliente;

public class TesteCliente {

	public static void main(String[] args) throws IOException {
		Cliente cli2 = new Cliente();
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome do cliente:");
		cli2.setNome(sc.nextLine());
		System.out.println("Digite o cpf:");
		cli2.setCpf(sc.nextLine());
		System.out.println("Digite o email:");
		cli2.setEmail(sc.nextLine());
		


	}

}
