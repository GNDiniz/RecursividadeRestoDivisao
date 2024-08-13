package controller;

public class RestoDivisaoController {

	public RestoDivisaoController() {
		super();
	}
	
	public int divisao(int dividendo, int divisor) {
		int resto = dividendo;
		//Condição de Parada
		if (resto < divisor) {
			return resto;
		} else {
			dividendo = resto - divisor;
			resto = dividendo;
			return divisao(dividendo, divisor);
		}
	}
}
