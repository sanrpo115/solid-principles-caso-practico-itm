package FatntPro.app.LiskovSubstitutionPrinciple;

/*
 * 
 * Esta es una nueva interfaz que extrae el cálculo del IMC.
 * 
 */
public interface ICalculateIMC {
	
	public double calculateIMC(double weight, double height);

}
