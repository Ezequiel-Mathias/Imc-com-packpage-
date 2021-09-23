package imcexercicio;
import java.util.Scanner;

import rascunho.imcrascunho;
public class imcPackge {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		imcrascunho calculo = new imcrascunho();
		System.out.println("------------------------------------ Calculo do IMC ------------------------------------");
		

		System.out.println("Digite o seu peso correspondente :  ");
		calculo.pesagem = leitor.nextDouble();

		System.out.println("Digite sua altura correspondente : ");
		calculo.altura = leitor.nextDouble();

		leitor.close();

		calculo.calcular();
		calculo.calculogeral();

		
		System.out.println("Seu imc é correspondete a :" + calculo.IMC);
		System.out.println("Sua classificação : " + calculo.resultado);

		
		

	}

}
