package rascunho;

public class imcrascunho {

	 public double pesagem, altura, IMC;
    	public String resultado;

    	public void calcular() {
    		IMC = pesagem / (altura * altura);
    	}

    	public void calculogeral() {
    		if (IMC < 18.5) {
    			resultado = "Abaixo do peso, engorde mais um pouquin";
    		} else if (18.5 <= IMC && IMC <= 24.9) {
    			resultado = "Peso Normal,parabens";
    		} else if (25 <= IMC && IMC <= 29.9) {
    			resultado = "sobrepeso,emagrece um pouquin";
    		} else if(30 <= IMC && IMC <= 34.9) {
    			resultado = "Obesidade Grau 1, emagrecer urgente";
    		} else if(35 <= IMC && IMC <= 39.9) {
    			resultado = "Obesidade Grau 2, se vai morre doido";
    		} else  {
    			resultado = "Obesidade Grau 3 ou Mórbida,te vejo no céu";
    		}
	
}
}