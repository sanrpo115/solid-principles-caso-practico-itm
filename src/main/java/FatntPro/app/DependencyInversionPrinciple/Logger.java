package FatntPro.app.DependencyInversionPrinciple;

/*
 *
 * Se establece que los módulos de alto nivel no deben depender de módulos de bajo nivel,
 * ambos deben depender de abstraccines
 * además, las abstracciones no deben depender de los detaller,
 * los detalles deben depender de las abstracciones
 * 
 * Esta clase simula el registro de algún mensaje.
 * No depende de otras clases.
 * 
 */
public class Logger implements ILogger {

	@Override
	public void print(String message) {
		System.out.println("	Log: " + message);
		
	}

}
