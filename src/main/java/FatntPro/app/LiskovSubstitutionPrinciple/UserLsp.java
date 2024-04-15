package FatntPro.app.LiskovSubstitutionPrinciple;

/*
 * 
 * La clase UserLsp contiene todo lo relacionado con un usuario.
 * Ahora podemos heredar de esta clase y crear nuevos tipos de usuarios.
 * sin necesidad de cambiar este código.
 *
 * No necesitamos implementar getUserType desde IUser ni calculateIMC de ICalculateIMC. 
 * esto se debe a que esta clase es declarada abstracta
 * Las clases derivadas necesitan implementar estos métodos (a menos que también sean abstractos)
 * 
 */
public abstract class UserLsp implements IUser, ICalculateIMC {
	
	String id;
	String name;
	
	public UserLsp(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
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
