package FatntPro.app.SingleResponsibilityPrinciple;

/* 
 * Una clase debe tener una sola razón para cambiar
 * Esto implica que debe tener solo una tarea o responsabilidad
 * 
 * Esta clase es responsable de Guardar una actividad creada por un usuario.
 * 
 */
public class RegistrarActividad {
	
	
	private static IActivityRepository _activityRepository;
	private static IProgressService _progressService;

	public RegistrarActividad(IActivityRepository activityRepository, IProgressService progressService) {
		_activityRepository = activityRepository;
		_progressService = progressService;
	}

	// Método que persiste la actividad y acumula la misma en el progreso mensual.
	public void saveActivity(Activity activity) {
		try {
			_activityRepository.insertActivity(activity);
			String result = _progressService.accumulatedProgress(activity);
			System.out.println("	" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
