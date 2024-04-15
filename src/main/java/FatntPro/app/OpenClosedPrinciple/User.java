package FatntPro.app.OpenClosedPrinciple;


/*
 *  
 * Las entidades como clases, módulos, funciones deben estar abiertas para su extensión
 * pero cerradas para su modificación
 * 
 * Esta clase contiene todo sobre un usuario, pero es declarada abstracta.
 * Ahora podemos heredar de esta clase y crear nuevos tipos de usuarios
 * sin la necesidad de cambiar este código.
 * El código ahora está abierto para extensión, pero cerrado para modificación.
 * 
 */
public abstract class User {
	
	String id;
	String name;
	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract boolean isHealthProfessional(boolean isHealthProf);

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
	public String toString() {
		return "Usuario { " +
				"id: " + id +
				", name: " + name +
				" }";
	}

}
