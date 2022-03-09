import java.util.Scanner;
import java.lang.Math;


//Faça um programa para uma loja de tintas. O programa deverá pedir 
//o tamanho em metros quadrados da àrea a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro 
//para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.  
//Informe ao usuario a quantidades de latas de tinta a serem compradas e o preço total.

public class LojaPintura {
	
	static final double COBERTURA_DA_TINTA_EM_METROS_QUADRADOS = 3; // Cobertura da tinta é de 1 litro para cada 3
	static final double LITRAGEM_DA_LATA_DE_TINTA = 18; // Cada lata tem 18 litros
	static final double PRECO_DA_LATA_DE_TINTA = 80; // Preço da lata de tinta

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("| LOJA DE PINTURA \nVEJA A QUANTIDADE DE LATAS POR METRO QUADRADO E O SEU PREÇO.\n\n\n");
		System.out.println("DIGITE O METRO QUADRADO:");
		double metragemQuadrada = scanner.nextInt();
		System.out.println("\n");

		double litrosgastos = calculaLitrosGastos(metragemQuadrada);
		double latasgastas = calculaLatasGastas(litrosgastos);
		double precoTotal = calculaPrecoPorLata(latasgastas);
		mostraPrecoEQuantidadeTinta(precoTotal, latasgastas);
		scanner.close();

	}

	public static double calculaLitrosGastos(double metragemQuadrada) {
		return (metragemQuadrada / COBERTURA_DA_TINTA_EM_METROS_QUADRADOS);
	}

	public static double calculaLatasGastas(double litrosgastos) {
		return Math.ceil(litrosgastos / LITRAGEM_DA_LATA_DE_TINTA);

	}

	public static double calculaPrecoPorLata(double latasgastas) {
		return (latasgastas * PRECO_DA_LATA_DE_TINTA);
	}

	public static void mostraPrecoEQuantidadeTinta(double precoTotal, double latasgastas) {
		System.out.printf("|QUANTIDADE DE LATAS: %d  | \n|PREÇO TOTAL: R$ %.2f  |\n\n    VOLTE SEMPRE!",
				(int) latasgastas, precoTotal);
	}

}
