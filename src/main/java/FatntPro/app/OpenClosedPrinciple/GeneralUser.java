package FatntPro.app.OpenClosedPrinciple;

/*
 * Un nuevo tipo de Usuario, este es un usuario general.
 * Podemos crear fácilmente tantos tipos nuevos como necesitemos.
 */
public class GeneralUser extends User {
	
	String rol = "BASIC";

	public GeneralUser(String id, String name) {
		super(id, name);
	}

	@Override
	public boolean isHealthProfessional(boolean isHealtProf) {
		return isHealtProf;
	}

}
