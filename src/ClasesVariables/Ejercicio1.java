package ClasesVariables;

public class Ejercicio1 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Juan Camilo";
		double x = Math.round(( Math.random())*100.0)/100.0;
		final double dolar = 3636.50; //variable constante
		float pi = (float)Math.PI;
		double euler = Math.E;
		        
		System.out.println("Este es el Nombre guardado "+nombre);
		System.out.println("Esta variable es aleatoria y solo muestra dos decimales "+x);
		System.out.println("Esta variable es constante y muesta el valor del dolar "+dolar);//frente al peso Colombiano en 04/07/2021
		System.out.println("Esta es el valor de PI con 7 decimales "+pi);
		System.out.println("Este es el valor de Euler con 15 decimales "+euler);


	}

}
