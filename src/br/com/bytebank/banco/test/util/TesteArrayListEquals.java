package br.com.bytebank.banco.test.util;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		List<Conta> lista = new LinkedList<Conta>();  // arrayList e LinkedList implementam a interface List
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean exist = lista.contains(cc3);
		
		System.out.println(exist);
		for(Conta conta : lista) {
			if(conta.eIgual(cc3)) {                       //if(conta==cc3)
				System.out.println("Já tenho essa conta");
			}
		}	
		
	}
}
