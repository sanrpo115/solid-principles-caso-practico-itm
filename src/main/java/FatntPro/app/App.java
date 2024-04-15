package FatntPro.app;

import FatntPro.app.DependencyInversionPrinciple.Logger;
import FatntPro.app.InterfaceSegregationPrinciple.*;
import FatntPro.app.LiskovSubstitutionPrinciple.*;
import FatntPro.app.OpenClosedPrinciple.*;
import FatntPro.app.SingleResponsibilityPrinciple.*;


public class App {
	
	
    public static void main( String[] args ) {
    	System.out.println();
    	System.out.println( ":::: DSI_Equipo_4 ::::");
    	System.out.println();
    	
    	callSingleResponsability();
    	callOpenClosed();
    	callLiskovSubstituion();
    	callInterfaceSegregation();
    	callDependencyInversion();
    }
    
    public static void callSingleResponsability() {
    	IActivityRepository activityRepository = new ActivityRepository();
        IProgressService progressService = new ProgressService();
        RegistrarActividad registrarActividad = new RegistrarActividad(activityRepository, progressService);
        
        Activity activity = new Activity();
        activity.name = "Cardio";
        registrarActividad.saveActivity(activity);
    }
    
    public static void callOpenClosed() {
    	User user = new GeneralUser("123456789", "Santiago Restrepo");
    	User proUser = new HealthProfessionalUser("9876543210", "Miguel Ojeda");
		System.out.println();
		System.out.println(":::::: Open/Closed Principle ::::::");
		System.out.println("	" + user + " Profesional de la salud: " + user.isHealthProfessional(false));
		System.out.println("	" + proUser + " Profesional de la salud: " + proUser.isHealthProfessional(true));
    }
    
    public static void callLiskovSubstituion() {
    	System.out.println();
		System.out.println(":::::: Liskov Substitution Principle ::::::");
    	
		// Ahora podemos sustituir el IUser por cada tipo de empleado,
        // ya que todos implementan esta interfaz.
        // En otras palabras, todos los tipos de Usuarios caben en IUser 
    	// (aunque no todos encajan en User).
    	IUser user = new GeneralUserLsp("1234", "Julian Osorio");
    	
    	// Creamos un nuevo empleado que no calcula el IMC
    	IUser profUser = new HealthProfessionalUserLsp("567890", "Lina Ocampo");
    	
    	// Como no todos los Usuarios deben calcular el IMC
    	// lo demostramos con la nueva funcionalidad del calculo IMC.
    	System.out.println("	" + user + " Tipo de Usuario: " + user.getUserType());
    	System.out.println("	" + profUser + " Tipo de Usuario: " + profUser.getUserType());
    	
    	// Por supuesto, todavía podemos calcular el IMC para aquellos que lo tienen, aunque
        // debemos convertirlos en UserLsp o en su propio tipo. Esto se debe a que el
        // IUser no contiene el método calculateIMC, mientras que User
        // lo hace (a través de calculateIMC) y por supuesto, los distintos tipos de Usuarios
        // que calculan IMC implementan su propia versión del método calculateIMC.
    	System.out.println();
    	System.out.println("	Calcular IMC:");
    	
    	// Castear a UserLsp.
    	// Dado que UserLsp contiene CalculateIMC - a través de ICalculateIMC
        // (no está implementado directamente en Empleado) esto también funciona.
        // También podríamos haber casteado a GeneralUserLsp.
    	System.out.println("	" + user + " IMC: " + ((UserLsp) user).calculateIMC(95, 1.73));
    }
    
    public static void callInterfaceSegregation() {
    	GeneralUserTasks generalUserTasks = new GeneralUserTasks();
    	HealthProfessionalUserTasks healthProfessionalUserTasks = new HealthProfessionalUserTasks();
    	
    	System.out.println();
		System.out.println(":::::: Liskov Substitution Principle ::::::");
    	System.out.println("	Llamando las tareas de usuario general:");
    	System.out.println("	Respuesta Consultar progreso: " + generalUserTasks.checkProgress("123456"));
    	System.out.println("	Respuesta Confirmar cita virtual: " + generalUserTasks.requestVirtualAppointment("123456", "Santiago Restrepo"));
    	
    	System.out.println();
    	System.out.println("	Llamando las tareas de un usuario profesional de la salud");
    	System.out.println("	Respuesta Consultar progreso: " + healthProfessionalUserTasks.checkProgress("123456"));
    }
    
    public static void callDependencyInversion() {
    	System.out.println();
    	System.out.println(":::::: Dependency Inversion Principle ::::::");
    	
    	Logger logger = new Logger();
    	logger.print("Interfaz e implementación sin dependencias");
    }
    
}
