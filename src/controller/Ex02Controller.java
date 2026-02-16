package controller;

public class Ex02Controller {

	public Ex02Controller() {
		// TODO Auto-generated constructor stub
		super();
	}
	public int menorValor(int []vet, int tamanho, int uValor) {
		
		//a condição de parada é definida como o momento que o tamanho do vetor chega a 0
		//isso significa que o vetor inteiro foi percorrido e o menor valor esta na variavel uValor
		if(tamanho == 0) {
			return uValor;
		}
		//a relação de chamada verifica se o menor valor atual é menor que o valor da posição que está sendo percorrida no momento
		//caso necessário faz a atribuição do valor a variavel que guarda o menor valor e chama o retorno da função
		else {
			if(uValor > vet[tamanho-1]) {
				uValor = vet[tamanho-1];
				return menorValor(vet, (tamanho-1), uValor);
			}
			return menorValor(vet, (tamanho-1), uValor);
		}
	}

}
