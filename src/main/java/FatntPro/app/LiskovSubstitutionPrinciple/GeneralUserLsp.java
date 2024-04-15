package FatntPro.app.LiskovSubstitutionPrinciple;

/*
 * 
 * Un nuevo tipo de Usuario, este es un usuario general.
 * Podemos crear fácilmente tantos tipos nuevos como necesitemos.
 * 
 */
public class GeneralUserLsp extends UserLsp {

	public GeneralUserLsp(String id, String name) {
		super(id, name);
	}
	
	@Override
	public String getUserType() {
		return "BASIC";
	}

	@Override
	public double calculateIMC(double weight, double height) {
		double imc = weight/(Math.pow(height, 2));
		return Math.rint(imc *100) / 100;
	}

}
