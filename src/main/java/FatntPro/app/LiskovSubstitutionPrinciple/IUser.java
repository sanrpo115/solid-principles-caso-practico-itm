package FatntPro.app.LiskovSubstitutionPrinciple;

/*
 * 
 * Las subclases deben ser sustituibles por sus clases base, es decir
 * los objetos de una clase deben poder ser reemplazados
 * por los objetos de una subclase sin afectar
 * a la corrección del programa
 * 
 * Una nueva interfaz, para dividir las responsabilidades de
 * la antigua clase User.
 * 
 */
public interface IUser {
	
	public String getId();
	
	public void setId(String id);
	
	public String getName();
	
	public void setName(String name);
	
	// Nuevo método: únicamente con el propósito de demostrar que podemos tener una
    // método común a todo tipo de empleados.
	public String getUserType();

}
