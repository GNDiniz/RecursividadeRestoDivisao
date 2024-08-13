package view;

import controller.RestoDivisaoController;

public class Principal {

	public static void main(String[] args) {
		RestoDivisaoController rdc = new RestoDivisaoController();
		
		int num1 = 11;
		int num2 = 3;
		
		int restoDivisao = rdc.divisao(num1, num2);
		System.out.println("O resto da divisão é igual a: "+restoDivisao);
		

	}

}
