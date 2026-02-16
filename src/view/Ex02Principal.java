package view;
import controller.Ex02Controller;
import javax.swing.JOptionPane;

public class Ex02Principal {

	public static void main(String[] args) {
		Ex02Controller ex02 = new Ex02Controller();
		int[]vet = new int[5];
		for(int i = 0; i<5; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número: "));
		}
		int tamanho = vet.length;
		int ultimoValor = vet[vet.length - 1];
		int menorValor = ex02.menorValor(vet, tamanho, ultimoValor);
		System.out.println("O menor valor é: "+menorValor);
	}


}
