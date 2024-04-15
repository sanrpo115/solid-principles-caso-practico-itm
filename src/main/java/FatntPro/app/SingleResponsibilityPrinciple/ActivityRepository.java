package FatntPro.app.SingleResponsibilityPrinciple;

/* 
 * La clase ActivityRepository solo tiene la responsabilidad de persistir la actividad en DB
 */
public class ActivityRepository implements IActivityRepository {
	

	@Override
	public boolean insertActivity(Activity activity) {
		// Código para insertar la actividad en la DB
		System.out.println(":::::: Single Responsibility Principle ::::::");
		System.out.println("	Actividad guardada correctamente");
		return true;
	}

}
