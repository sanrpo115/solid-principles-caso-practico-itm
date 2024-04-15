package FatntPro.app.OpenClosedPrinciple;

/*
 * Un nuevo tipo de Usuario, este es un usuario profesional de la salud.
 * Podemos crear fácilmente tantos tipos nuevos como necesitemos.
 */
public class HealthProfessionalUser extends User {
	
	String rol = "PF_HEALTH";

	public HealthProfessionalUser(String id, String name) {
		super(id, name);
	}

	@Override
	public boolean isHealthProfessional(boolean isHealtProf) {
		return isHealtProf;
	}

}
