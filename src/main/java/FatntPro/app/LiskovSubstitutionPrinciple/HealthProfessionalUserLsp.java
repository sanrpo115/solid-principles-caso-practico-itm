package FatntPro.app.LiskovSubstitutionPrinciple;

/*
 * 
 * Se introduce un nuevo tipo de empleado.
 * Éste no calcula el IMC
 * 
 * Solo implementa una interfaz
 * Observe que necesita implementar los mismos métodos que UserLsp,
 * ya que no hereda de UserLsp.
 * 
 */
public class HealthProfessionalUserLsp implements IUser {
	
	String id;
	String name;

	public HealthProfessionalUserLsp(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getUserType() {
		return "HEALTH_PROF";
	}
	
	@Override
	public String toString() {
		return "Usuario { " +
				"id: " + id +
				", name: " + name +
				" }";
	}

}
