package br.senai.sp.jandira;

public class CalculadoraDlinhaDeComando {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[2]);
		char sinal = args[1].charAt(0);
		
		
	 if(sinal == '+') {
			double resultado = somar(n1, n2);
			sair(n1,n2,sinal,resultado);
}else if (sinal == '-') {
	 double resultado = subtrair(n1, n2);
	 sair(n1,n2,sinal,resultado);
	 }else if (sinal == 'x') {
		 double resultado = multiplicar(n1, n2);
		 sair(n1,n2,sinal,resultado);
	 }else if(sinal == '/') {
		 double resultado = dividir(n1, n2);
		 sair(n1,n2,sinal,resultado);
}
	
	
	}
	public static double somar(double n1, double n2) {
		return n1 + n2;
}
public static double subtrair(double n1, double n2) {
	return n1 - n2;
}
	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	public static double dividir(double n1, double n2) {
		return n1 / n2;
	}
	
	public static void sair(double n1, double n2, char sinal, double resultado) {
		System.out.println(n1 + " " + sinal + " " + n2 + " = " + resultado);
	}
	
}
