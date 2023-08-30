// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class FabricaDeCarros{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();

            int custoConsumidor;
     
            int Distribuidor;
            int ValorImpostos;
 
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
        
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        custoConsumidor = custoFabrica + ValorImpostos + Distribuidor;
 
        System.out.println("Valor final do carro: R$" + custoConsumidor + ",00");
	}
}